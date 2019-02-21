package com.apexsoft.visual.service;

import java.util.Map;

/**
 * @program: visual
 * @description: 分析数据echarts
 * @author: ZDC111
 * @create: 2019-02-21 10:14
 **/
public interface AnalyService {
    /** 
    * @Description: 当日盈亏
    * @Param:  
    * @return:  
    * @Author: ZDC111
    * @Date: 2019/2/21 0021 
    */ 
    Map dryk(Map params);
    
    /**
    * @Description: 盈亏经营情况
    * @Param:
    * @return:
    * @Author: ZDC111
    * @Date: 2019/2/21 0021
    */
    Map ykjeqk(Map params);
}
