package com.nefu.software.tpa.dao;

import com.nefu.software.tpa.entity.entity.Plan;
import com.nefu.software.tpa.entity.entity.Production;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 扶贫计划DAO
 *
 * Created by Super腾 on 2017/1/31.
 */
@Repository
public interface PlanDao {


    /**
     * 通过扶贫用户ID来查询当前所拥有的扶贫计划
     * @param reliefId
     * @return
     */
    public Plan searchPlan(Integer reliefId);

    /**
     * 插入扶贫计划
     * @param plan
     */
    public void insertPlan(Plan plan);

    /**
     * 查询全部扶贫计划
     * @return
     */
    public List<Plan> searchAll();

    /**
     * 通过扶贫ID和标记来查询扶贫计划
     * @return
     */
    public Plan searchPlanByIdAndFlag(Plan plan);

    /**
     * 通过扶贫ID来查询扶贫计划
     * @param planId
     * @return
     */
    public Plan searchPlanById(Integer planId);

    /**
     * 删除扶贫计划
     * @param plan
     */
    public void deletePlan(Plan plan);

    /**
     * 删除扶贫计划通过主键
     * @param planId
     */
    public void deletePlanById(Integer planId);

}
