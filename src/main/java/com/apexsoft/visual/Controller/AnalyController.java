package com.apexsoft.visual.Controller;

import com.apexsoft.visual.bean.AjaxResponseBody;
import com.apexsoft.visual.service.AnalyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @program: visual
 * @description: 分析数据controller层echarts
 * @author: ZDC111
 * @create: 2019-02-21 11:01
 **/
@Controller
@RequestMapping("/analy")
public class AnalyController {
    @Autowired
    private AnalyService analyService;

    @ResponseBody
    @GetMapping("/getDryk")
    public AjaxResponseBody getDryk(@RequestParam Map<String, String> map){
        Map result = analyService.dryk(map);
        return dealResult(result);
    }

    @ResponseBody
    @GetMapping("/getYkjeqk")
    public AjaxResponseBody getYkjeqk(@RequestParam Map<String, String> map){
        Map result = analyService.ykjeqk(map);
        return dealResult(result);
    }

    /**
     * @Description: 处理结果
     * @param result 得到结果 ybName 游标名称
     * @return
     * @throws
     * @author asarory
     * @date 2018/11/27 下午3:59
     */
    public AjaxResponseBody dealResult(Map result){
        AjaxResponseBody arby = new AjaxResponseBody();
        if(result==null || result.get("cur")==null||((List)result.get("cur")).size()<=1){
            arby.setStatus("-1");
            arby.setMsg("请求失败");
        }else {
            arby.setStatus("1");
            arby.setMsg("请求成功");
            arby.setResult(result);
        }
        return arby;
    }

}


