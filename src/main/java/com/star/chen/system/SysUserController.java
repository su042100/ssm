package com.star.chen.system;

import com.star.chen.system.model.SysUser;
import com.star.common.util.JsonResponseBody;
import com.star.common.util.ResponseStatus;
import com.star.common.util.annotation.Log;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @RequestMapping("/userLogin")
    @Log(title="登录后台")
    public JsonResponseBody<String> userLogin(SysUser user){
        //获取主体
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getEmpUsername(),
                user.getEmpPwd()
        );
        String message = "";
        //登录
        try {
            subject.login(usernamePasswordToken);
            message = "OK";
        } catch (IncorrectCredentialsException e){
            e.printStackTrace();
            message = "密码错误！";
        } catch (AuthenticationException e){
            message = "账号错误！";
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
            message = "账号或者密码错误！";
        }
        JsonResponseBody<String> jsonResponseBody = new JsonResponseBody<>();
        jsonResponseBody.setMsg(message);
        jsonResponseBody.setStatus("OK".equals(message)?ResponseStatus.STATUS_200.getStatus():
                ResponseStatus.STATUS_206.getStatus());
        jsonResponseBody.setData(subject.getPrincipal().toString());
        return jsonResponseBody;
    }

    /**
     * 退出登陆
     * @return 响应结果
     */
    @RequestMapping("/userLogout")
    public JsonResponseBody<?> userLogout(){
        //退出登陆
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.logout();
            return new JsonResponseBody<>("OK");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return new JsonResponseBody<>(ResponseStatus.STATUS_500.getStatus(),ResponseStatus.STATUS_500.getMsg());
        }
    }

}
