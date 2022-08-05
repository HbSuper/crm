package com.huike.web.controller.clues;


import com.github.pagehelper.PageInfo;
import com.huike.clues.domain.TbClue;
import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.domain.vo.TbClueTrackRecordVo;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.clues.service.impl.TbClueServiceImpl;
import com.huike.common.annotation.Log;
import com.huike.common.constant.HttpStatus;
import com.huike.common.core.controller.BaseController;
import com.huike.common.core.domain.AjaxResult;
import com.huike.common.core.page.TableDataInfo;
import com.huike.common.enums.BusinessType;
import com.huike.common.utils.DateUtils;
import com.huike.common.utils.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 线索跟进记录Controller
 * @date 2021-04-22
 */
@RestController
@RequestMapping("/clues/record")
public class TbClueTrackRecordController extends BaseController {
    @Autowired
    private ITbClueTrackRecordService tbClueTrackRecordService;
    /**
     * 查询线索跟进记录列表
     */
    @PreAuthorize("@ss.hasPermi('clues:record:list')")
    @GetMapping("/list")
    public TableDataInfo list(@RequestParam("clueId")Long clueId) {
        List<TbClueTrackRecordVo> tbClueTrackRecordVos = tbClueTrackRecordService.selectTbClueRecordList(clueId);
        int size = tbClueTrackRecordVos.size();

        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(HttpStatus.SUCCESS);
        rspData.setMsg("查询成功");
        rspData.setRows(tbClueTrackRecordVos);
        rspData.setTotal(new PageInfo(tbClueTrackRecordVos).getTotal());
        return rspData ;

    }


    /**
     * 新增线索跟进记录
     */
    @PreAuthorize("@ss.hasPermi('clues:record:add')")
    @Log(title = "线索跟进记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbClueTrackRecord tbClueTrackRecord) {
        return AjaxResult.success(tbClueTrackRecordService.add(tbClueTrackRecord));
    }
}
