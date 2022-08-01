package com.huike.report.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 *
 * @author Administrator
 */
public interface ReportMapper {
    /**=========================================基本数据========================================*/
    /**
     * 获取线索数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getCluesNum(@Param("startTime") String beginCreateTime,
                        @Param("endTime") String endCreateTime,
                        @Param("username") String username);

    /**
     * 获取商机数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getBusinessNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同数量
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Integer getContractNum(@Param("startTime") String beginCreateTime,
                           @Param("endTime") String endCreateTime,
                           @Param("username") String username);

    /**
     * 获取合同金额
     *
     * @param beginCreateTime 开始时间
     * @param endCreateTime   结束时间
     * @param username        用户名
     * @return
     */
    Double getSalesAmount(@Param("startTime") String beginCreateTime,
                          @Param("endTime") String endCreateTime,
                          @Param("username") String username);

    /**
     * 获取全部线索数量
     *
     * @param beginCreateTime 开始时间
     * @param endTime   结束时间
     * @return
     */
    Integer getAllContractNum(@Param("startTime") String beginCreateTime, @Param("endTime") String endTime);

    /**
     * 获取有效线索数
     * @param beginCreateTime 开始时间
     * @param endCreateTime 结束时间
     * @param statusTypeList 有效线索列表
     * @return
     */
    Integer geteffectiveContractNum(@Param("startTime") String beginCreateTime,@Param("endTime") String endCreateTime,@Param("statusTypeList") List<String> statusTypeList);

    /**
     * 获取待跟进线索数目
     * @param beginCreateTime 开始时间
     * @param endCreateTime 结束时间
     * @return 待跟进线索数目
     */
    Integer getTofollowedCluesNum(@Param("startTime") String beginCreateTime,@Param("endTime") String endCreateTime);
    /**
     * 获取待跟进商机数目
     * @param beginCreateTime 开始时间
     * @param endCreateTime 结束时间
     * @return 待跟进商机数目
     */
    Integer getTofollowedBusinessNum(@Param("startTime") String beginCreateTime,@Param("endTime") String endCreateTime);
    /**
     * 获取待分配线索数目
     * @param beginCreateTime 开始时间
     * @param endCreateTime 结束时间
     * @return 待分配线索数目
     */
    Integer getToallocatedCluesNum(@Param("startTime") String beginCreateTime,@Param("endTime") String endCreateTime);
    /**
     * 获取待分配商机数目
     * @param beginCreateTime 开始时间
     * @param endCreateTime 结束时间
     * @return 待分配商机数目
     */
    Integer getToallocatedBusinessNum(@Param("startTime") String beginCreateTime,@Param("endTime") String endCreateTime);

    /**=========================================今日简报========================================*/


    /**=========================================待办========================================*/

}
