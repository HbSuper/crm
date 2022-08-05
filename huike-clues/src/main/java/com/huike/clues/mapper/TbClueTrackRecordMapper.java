package com.huike.clues.mapper;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.domain.vo.TbClueTrackRecordVo;

import java.util.List;

/**
 * 线索跟进记录Mapper接口
 * @date 2021-04-19
 */
public interface TbClueTrackRecordMapper {
    /**
     * 新增线索跟进记录
     * @param tbClueTrackRecord
     * @return
     */

    Integer InsertRecord(TbClueTrackRecord tbClueTrackRecord);

    List<TbClueTrackRecordVo> SelectRecord(Long clueId);
}
