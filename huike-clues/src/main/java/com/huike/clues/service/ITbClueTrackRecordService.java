package com.huike.clues.service;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.domain.vo.TbClueTrackRecordVo;
import com.huike.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 线索跟进记录Service接口
 * 
 * @author WGL
 * @date 2022-04-19
 */
public interface ITbClueTrackRecordService {

    /**
     * 新增线索跟进记录
     * @param tbClueTrackRecord 线索跟进记录
     * @return
     */
    Integer add(TbClueTrackRecord tbClueTrackRecord);

    List<TbClueTrackRecordVo> selectTbClueRecordList(Long clueId);
}
