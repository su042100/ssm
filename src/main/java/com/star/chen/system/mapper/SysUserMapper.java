package com.star.chen.system.mapper;

import com.star.chen.system.model.SysUser;
import com.star.chen.system.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;


@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Long empId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser selectUserByUsername(@Param("username") String username);

    int updateUserPwd(SysUser user);

    List<UserVo> queryListSysUserPager(UserVo user);

    List<UserVo> selectUsersAll();

    Set<String> selectRoles(@Param("username") String username);

    Set<String> selectPermissions(@Param("username") String username);

}