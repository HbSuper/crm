package com.huike.business.service.impl;


import com.huike.business.domain.TbBusiness;
import com.huike.business.domain.TbBusinessTrackRecord;
import com.huike.business.domain.vo.BusinessTrackVo;
import com.huike.business.mapper.TbBusinessTrackRecordMapper;
import com.huike.business.service.ITbBusinessService;
import com.huike.business.service.ITbBusinessTrackRecordService;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.utils.DateUtils;
import com.huike.common.utils.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商机跟进记录Service业务层处理
 * 
 * @author wgl
 * @date 2021-04-28
 */
@Service
public class TbBusinessTrackRecordServiceImpl implements ITbBusinessTrackRecordService {
    @Autowired
    private ITbBusinessService tbBusinessService;

    @Autowired
    private TbBusinessTrackRecordMapper tbBusinessTrackRecordMapper;
    /**
     * 新增商机跟进记录
     */
    @Transactional
   public Integer insertRecord(BusinessTrackVo businessTrackVo){
       //先更新商机表字段
       TbBusiness tbBusiness = new TbBusiness();
       BeanUtils.copyProperties(businessTrackVo,tbBusiness);
       tbBusiness.setCreateTime(null);
       tbBusiness.setUpdateTime(DateUtils.getNowDate());
       tbBusiness.setUpdateBy(SecurityUtils.getUsername());
       tbBusiness.setId(businessTrackVo.getBusinessId());
       tbBusinessService.updateTbBusiness(tbBusiness);

       //再新增商机跟进表
       TbBusinessTrackRecord tbBusinessTrackRecord = new TbBusinessTrackRecord();
       BeanUtils.copyProperties(businessTrackVo,tbBusinessTrackRecord);
       tbBusinessTrackRecord.setCreateBy(SecurityUtils.getUsername());
       tbBusinessTrackRecord.setCreateTime(DateUtils.getNowDate());
       return tbBusinessTrackRecordMapper.insertTbBusinessTrackRecord(tbBusinessTrackRecord);

   }

    /**
     * 查询商机跟进记录列表
     */
    @Override
    public List<TbBusinessTrackRecord> selectBusinessTrackRecordList(Long id) {
        return tbBusinessTrackRecordMapper.selectTbBusinessTrackRecord(id);
    }
}
