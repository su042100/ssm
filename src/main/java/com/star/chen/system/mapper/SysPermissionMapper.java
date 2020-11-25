package com.star.chen.system.mapper;

import com.star.chen.system.model.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(String menuid);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(String menuid);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}