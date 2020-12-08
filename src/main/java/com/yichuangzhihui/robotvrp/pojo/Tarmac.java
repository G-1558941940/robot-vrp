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
public class Tarmac {
    /**
    * 主键
    */
    private Long tarmacId;

    /**
    * 停机坪名称
    */
    private String tarmacName;

    /**
    * 经度
    */
    private BigDecimal tarmacLng;

    /**
    * 纬度
    */
    private BigDecimal tarmacLat;

    /**
    * 创建时间
    */
    private Date createDate;

    /**
    * 是否删除
    */
    private Boolean isDelete;
}