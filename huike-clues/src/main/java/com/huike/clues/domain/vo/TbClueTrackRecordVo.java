package com.huike.clues.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangbin
 * @description tb_clue_track_recordVo
 * @date 2022-08-04
 */
@Data
public class TbClueTrackRecordVo implements Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 跟进人
     */
    private String createBy;


    /**
     * 跟进时间
     */
    private Date createTime;
    /**
     * 跟进人
     */
    private String updateBy;

    /**
     * 更新跟进时间
     */
    private Date updateTime;

    /**
     * 主键id
     */
    private Integer Id;

    /**
     * 线索id
     */
    private Integer clueId;
    /**
     * 意向学科
     */
    private String subject;

    /**
     * 跟进记录
     */
    private String record;

    /**
     * 意向等级
     */
    private String level;


    /**
     * 0 正常跟进线索 ，1 伪线索
     */
    private Integer type;

    /**
     * 伪线索原因
     */
    private String falseReason;

    /**
     * 下次跟进时间
     */
    private Date nextTime;


}