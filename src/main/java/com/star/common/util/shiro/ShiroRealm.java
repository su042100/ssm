package com.star.common.util.shiro;

import com.star.chen.system.model.SysUser;
import com.star.chen.system.service.ISysUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

@Slf4j
@AllArgsConstructor
public class ShiroRealm extends AuthorizingRealm {


    private final ISysUserService sysUserService;

    /**
     * 用户授权
     * @param principalCollection 授权对象
     * @return 授权结果
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        //获取身份
        String primaryPrincipal = principalCollection.getPrimaryPrincipal().toString();
        log.debug(primaryPrincipal.toString());

        //根据身份获取角色和权限信息
        Set<String> roles = sysUserService.selectRoles(primaryPrincipal);
        //获取权限
        Set<String> permissions = sysUserService.selectPermissions(primaryPrincipal);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //设置角色
        simpleAuthorizationInfo.setRoles(roles);
        //设置权限
        simpleAuthorizationInfo.setStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证（登录退出）
     * @param authenticationToken 请求token
     * @return 认证结果
     * @throws AuthenticationException 认证异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取请求的身份（账号）
        String username = authenticationToken.getPrincipal().toString();
        //获取请求凭据（密码）
        String password = authenticationToken.getCredentials().toString();

        //获取安全数据源
        SysUser sysUser = sysUserService.selectUserByUsername(username);

        //不存在直接抛异常
        if(null==sysUser)
            throw new RuntimeException("账号不存在！");

        //生成安全认证信息返回
        return new SimpleAuthenticationInfo(
                sysUser.getEmpUsername(),
                sysUser.getEmpPwd(),
                ByteSource.Util.bytes(sysUser.getEmpSalt()),
                this.getName()
        );
    }
}
