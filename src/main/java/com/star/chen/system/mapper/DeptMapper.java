package com.star.chen.system.mapper;

import com.star.chen.system.model.Dept;

public interface DeptMapper {
    int deleteByPrimaryKey(Long depId);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Long depId);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}