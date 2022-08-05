package com.huike.report.domain.vo;

import lombok.Data;

/**
 * 首页--线索转化龙虎榜
 * @author huangbin
 * @Date 2022/8/2 14:06
 */
@Data
public class SalesStatisticsVO {
    private String create_by; //用户名称
    private String deptName;  //部门名称
    private Integer num; //转化数量
    private Double radio;  //转化率


}
