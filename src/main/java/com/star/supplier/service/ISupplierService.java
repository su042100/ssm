package com.star.supplier.service;

import com.star.supplier.model.Supplier;

public interface ISupplierService {
    int deleteByPrimaryKey(Long supId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(Long supId);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}