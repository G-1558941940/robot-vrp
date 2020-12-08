package com.yichuangzhihui.robotvrp.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TaskPoint {
    /**
    * 任务点id
    */
    private Long taskPointId;

    /**
    * 任务点名称
    */
    private String taskPointName;

    /**
    * 任务点经度
    */
    private BigDecimal taskPointLng;

    /**
    * 任务点纬度
    */
    private BigDecimal taskPointLat;

    /**
    * 创建时间
    */
    private Date createDate;

    /**
    * 是否删除
    */
    private Boolean isDelete;
}