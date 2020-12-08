package com.yichuangzhihui.robotvrp.mapper;

import com.yichuangzhihui.robotvrp.pojo.Tarmac;

public interface TarmacMapper {
    int deleteByPrimaryKey(Long tarmacId);

    int insert(Tarmac record);

    int insertSelective(Tarmac record);

    Tarmac selectByPrimaryKey(Long tarmacId);

    int updateByPrimaryKeySelective(Tarmac record);

    int updateByPrimaryKey(Tarmac record);
}