package com.huike.clues.service.impl;


import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.domain.vo.TbClueTrackRecordVo;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.utils.SecurityUtils;
import com.huike.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 线索跟进记录Service业务层处理
 *
 * @date 2022-04-22
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {
    @Autowired
    private TbClueTrackRecordMapper tbClueTrackRecordMapper;

    /**
     * 新增线索跟进记录
     *
     * @param tbClueTrackRecord 线索跟进记录
     * @return
     */
    @Override
    public Integer add(TbClueTrackRecord tbClueTrackRecord) {
        Long userId = SecurityUtils.getUserId();
        tbClueTrackRecord.setCreateBy(SecurityUtils.getUsername());
        tbClueTrackRecord.setCreateTime(new Date());
        return tbClueTrackRecordMapper.InsertRecord(tbClueTrackRecord);
    }

    @Override
    public List<TbClueTrackRecordVo> selectTbClueRecordList(Long clueId) {
        return tbClueTrackRecordMapper.SelectRecord(clueId);
    }
}
