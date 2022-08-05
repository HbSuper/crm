package com.huike.business.service;

import com.huike.business.domain.TbBusinessTrackRecord;
import com.huike.business.domain.vo.BusinessTrackVo;
import com.huike.common.core.domain.AjaxResult;

import java.util.List;

/**
 * 商机跟进记录Service接口
 * @date 2021-04-28
 */
public interface ITbBusinessTrackRecordService {

    /**
     * 新增商机跟进记录
     */
    Integer insertRecord(BusinessTrackVo businessTrackVo);

    /**
     * 查询商机跟进记录列表
     */
    List<TbBusinessTrackRecord> selectBusinessTrackRecordList(Long id);
}
