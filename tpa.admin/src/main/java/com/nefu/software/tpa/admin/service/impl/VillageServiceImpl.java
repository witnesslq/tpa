package com.nefu.software.tpa.admin.service.impl;

import com.nefu.software.tpa.admin.service.VillageService;
import com.nefu.software.tpa.dao.VillageDao;
import com.nefu.software.tpa.entity.entity.Village;
import com.nefu.software.tpa.entity.enums.ResultStatus;
import com.nefu.software.tpa.entity.response.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 自然村业务层
 * Created by Super腾 on 2017/1/29.
 */
@Service
public class VillageServiceImpl implements VillageService {

    private static Logger logger = LoggerFactory.getLogger(VillageServiceImpl.class);

    @Autowired
    public VillageDao villageDao;

    /**
     * 显示全部自然村信息
     * @return
     */
    public Result selectAll() {
        Result result = new Result();
        List<Village> list;
        try{
            list = villageDao.selectAll();
        }catch (Exception e){
            logger.error("自然村DAO层出现错误！");
            result.setResultStatus(ResultStatus.FAILURE);
            return result;
        }
        result.setResultStatus(ResultStatus.SUCCESSFUL);
        result.setObject(list);
        return result;
    }


    /**
     * 更新自然村信息
     * @param village 自然村包装咧
     * @return 部分页面地址
     */
    public Result updateVillage(Village village) {
        Result result = new Result();
        try{
            villageDao.updateVillage(village);
        }catch (Exception e){
            logger.error("自然村DAO出现错误");
            result.setResultStatus(ResultStatus.FAILURE);
            return result;
        }
        result.setResultStatus(ResultStatus.SUCCESSFUL);
        return result;
    }
}