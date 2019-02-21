package com.apexsoft.visual.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: visual
 * @description: 盈亏经营情况
 * @author: ZDC111
 * @create: 2019-02-21 15:18
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ykjyqkMap {
    private String lx;   //类型
    private String zyl;   //日期
    private String zks;   //日期
}
