package com.star.supplier.service.impl;

import com.star.supplier.mapper.SupplierMapper;
import com.star.supplier.model.Supplier;
import com.star.supplier.service.ISupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SupplierServiceImpl implements ISupplierService {

    private final SupplierMapper supplierMapper;

    @Override
    public int deleteByPrimaryKey(Long supId) {
        return supplierMapper.deleteByPrimaryKey(supId);
    }

    @Override
    public int insert(Supplier record) {
        return supplierMapper.insert(record);
    }

    @Override
    public int insertSelective(Supplier record) {
        return supplierMapper.insertSelective(record);
    }

    @Override
    public Supplier selectByPrimaryKey(Long supId) {
        return supplierMapper.selectByPrimaryKey(supId);
    }

    @Override
    public int updateByPrimaryKeySelective(Supplier record) {
        return supplierMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Supplier record) {
        return supplierMapper.updateByPrimaryKey(record);
    }
}
