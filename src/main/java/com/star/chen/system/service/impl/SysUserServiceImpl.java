package com.star.chen.system.service.impl;

import com.star.chen.system.mapper.SysUserMapper;
import com.star.chen.system.model.SysUser;
import com.star.chen.system.service.ISysUserService;
import com.star.chen.system.vo.UserVo;
import com.star.common.util.PageBean;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class SysUserServiceImpl implements ISysUserService {

    private final SysUserMapper sysUserMapper;

    @Override
    public Set<String> selectPermissions(String username) {
        return sysUserMapper.selectPermissions(username);
    }

    @Override
    public SysUser selectUserByUsername(String username) {
        return sysUserMapper.selectUserByUsername(username);
    }

    @Override
    public List<UserVo> selectUsersAll() {
        return sysUserMapper.selectUsersAll();
    }

    @Override
    public Set<String> selectRoles(String username) {
        return sysUserMapper.selectRoles(username);
    }

    @Transactional
    @Override
    public int updateUserPwd(SysUser user) {
        return sysUserMapper.updateUserPwd(user);
    }

    @Override
    public List<UserVo> queryListSysUserPager(UserVo userVo, PageBean pg) {
        return sysUserMapper.queryListSysUserPager(userVo);
    }
}
