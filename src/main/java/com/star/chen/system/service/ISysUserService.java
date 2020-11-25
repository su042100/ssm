package com.star.chen.system.service;

import com.star.chen.system.model.SysUser;
import com.star.chen.system.vo.UserVo;
import com.star.common.util.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Set;

public interface ISysUserService {

    /**
     * 通过员工名字找到此员工
     * @param username 用户名
     * @return 员工
     */
    SysUser selectUserByUsername(String username);

    /**
     * 修改员工密码的方法
     * @param user 用户对象
     * @return 影响行数
     */
    int updateUserPwd(SysUser user);

    /**
     * 分页查询用户
     * @param userVo 数据传递
     * @return 集合
     */
    List<UserVo> queryListSysUserPager(UserVo userVo, PageBean pg);

    /**
     * 导出所有的用户的方法
     * @return 用户集合
     */
    List<UserVo> selectUsersAll();

    /**
     * 根据用户名找到对应的角色集合
     * @param username 用户
     * @return 角色集合
     */
    Set<String> selectRoles(@Param("username") String username);

    /**
     * 根据用户名找到对应的权限
     * @param username 用户名
     * @return 权限集合
     */
    Set<String> selectPermissions(@Param("username") String username);

}
