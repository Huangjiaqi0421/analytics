package com.memebox.analytics.controller;

import com.alibaba.fastjson.JSON;
import com.memebox.analytics.base.BaseResponse;
import com.memebox.analytics.cache.RedisDao;
import com.memebox.analytics.entity.EventMapping;
import com.memebox.analytics.entity.EventReport;
import com.memebox.analytics.entity.ReportInfo;
import com.memebox.analytics.service.EventMappingService;
import com.memebox.analytics.service.EventReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Frank on 17/5/18.
 * 埋点日志
 */
@Controller
@RequestMapping("/test")
public class EventReportController {
    @Autowired
    EventReportService eventReportService;
//    @RequestMapping(value = "/add" , method = RequestMethod.GET)
//    @ResponseBody
//    public Object insertEventReport(HttpServletRequest request){
//
//        int count =eventReportService.insertEventReprot(eventReport);
//        BaseResponse<String>  response=new BaseResponse<>();
//        response.setCode(count);
//        if(count>0){
//            response.setMsg("成功");
//        }else {
//            response.setMsg("失败");
//        }
//
//        Map<String,String[]> map=request.getParameterMap();
//        return map;
//    }
    /**
     *
     */





    @Autowired
    RedisDao redisDao;
    @Autowired
    EventMappingService eventMappingService;


    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public Object test(HttpServletRequest request){
       List<EventMapping>  list= eventMappingService.getEventMappingsByName("add_cart");
        return  list;
    }

}
