package com.yichuangzhihui.robotvrp.mapper;

import com.yichuangzhihui.robotvrp.pojo.TaskPoint;

public interface TaskPointMapper {
    int deleteByPrimaryKey(Long taskPointId);

    int insert(TaskPoint record);

    int insertSelective(TaskPoint record);

    TaskPoint selectByPrimaryKey(Long taskPointId);

    int updateByPrimaryKeySelective(TaskPoint record);

    int updateByPrimaryKey(TaskPoint record);
}