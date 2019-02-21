package com.apexsoft.visual.service.impl;

import com.apexsoft.visual.mybatis.mapper.AnalyMapper;
import com.apexsoft.visual.service.AnalyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @program: visual
 * @description: 分析数据echarts实现类
 * @author: ZDC111
 * @create: 2019-02-21 10:27
 **/
@Service
public class AnalyServiceImpl implements AnalyService {
    @Autowired
    private AnalyMapper analyMapper;

    @Override
    public Map dryk(Map params){
        analyMapper.dryk(params);
        return params;
    }
    @Override
    public Map ykjeqk(Map params){
        analyMapper.ykjeqk(params);
        return params;
    }
}
