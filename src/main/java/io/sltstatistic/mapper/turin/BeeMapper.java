package io.sltstatistic.mapper.turin;


import io.sltstatistic.model.turin.UserBase;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author: JuPeng
 * @Email：pengju918@sina.com
 * @Date:  2018/3/7 0007 09:43
 * @Param:
 */
public interface BeeMapper {


    List<Map> selectUserIdListByh(@Param("time") String time, @Param("randomRatio") String randomRatio);

    List<Map> selectUserIdListByhWuYi(@Param("time") String time);

    int insertRecordProductionList(List<Map> honeyMap);

    int updateHoneyStatus(List honeyIds);

    Map<String,Object> getAssetsByUserID(@Param("userId") String userId);

    List<Map<String,Object>> getHoneyLurplusUserID(@Param("userId") String userId);


    List<Map<String,Object>> getHoneyLurplusFriendId(Map<String, String> map);

    /**
     * @Description: TODO (生产记录 剩余蜂蜜量减额)
     * @Author: JuPeng
     * @Email：pengju918@sina.com
     * @Date:  2018/3/8 0008 09:33
     * @Param:
     * @param map
     */
    int subProductionHoneyAmt(Map<String, Object> map);

    /**
     * @Description: TODO (用户资产表 根据用户ID 给对应用户 增加蜂蜜)
     * @Author: JuPeng
     * @Email：pengju918@sina.com
     * @Date:  2018/3/8 0008 11:19
     * @Param:
     */
    int updateUserAssetsHoneyAmt(@Param("userId") String userId, @Param("honeyAmount") BigDecimal honeyAmount);

    int updateUserAssetsBeesCount(@Param("userId") String userId, @Param("bees") int bees);



    /**
     * @Description: TODO (增加蜂蜜采集记录)
     * @Author: JuPeng
     * @Email：pengju918@sina.com
     * @Date:  2018/3/8 0008 11:36
     * @Param: 采集人，被采人，采取蜂蜜量
     */
    int insertRecordGather(@Param("userId") String userId, @Param("possessorId") String possessorId,
                           @Param("honeyAmount") BigDecimal honeyAmount, @Param("honeyId") Integer honeyId);


    List<Map<String,Object>> selectDynamicListByUserId(@Param("start") Integer start, @Param("pageItem") Integer pageItem, @Param("userId") String userId);

    List<Map<String,Object>> selectTaskList(@Param("userId") String userId);

    List selectRankList();

    Map<String,Object> getUserAssetsInfo(UserBase userBase);

    void updateHoneyStatus2(int i);

    List getUserGatherRank(UserBase userBase);

    List getUserGatheredRank(UserBase userBase);

    List<Integer> selectHoneyTTLIds(@Param("timeBegin") String timeBegin, @Param("timeAfter") String timeAfter);

    int cutHoneyByUserID(@Param("userId") String userId, @Param("honeyAmt") Double honeyAmt);


    Integer getTaskId(@Param("taskName") String taskName);
}