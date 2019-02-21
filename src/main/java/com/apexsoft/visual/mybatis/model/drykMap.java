package com.apexsoft.visual.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: visual
 * @description: 单日盈亏类  -游标输出
 * @author: ZDC111
 * @create: 2019-02-21 14:46
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class drykMap {
    private String rq;   //日期
    private String cjsj;
    private String pcyk;
    private String sxf;  //手续费
}
