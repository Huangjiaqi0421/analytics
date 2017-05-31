package com.memebox.analytics.controller;

import com.memebox.analytics.base.BaseResponse;
import com.memebox.analytics.entity.EventReport;
import com.memebox.analytics.service.EventReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.Date;

/**
 * Created by Frank on 17/5/24.
 */
@Controller
public class MainController {
    @Autowired
    EventReportService eventReportService;
    /**
     *  埋点日志写入
     * @param request
     * @return
     */
    @RequestMapping(value = "/report/add" , method = RequestMethod.GET)
    @ResponseBody
    public Object insertEventReport(HttpServletRequest request){

        EventReport eventReport=new EventReport();
        BaseResponse<String> response=new BaseResponse<>();
        try {
            eventReport.setProperty(URLDecoder.decode(request.getParameter("property"),"utf8"));
            eventReport.setEventName(request.getParameter("eventName"));
            eventReport.setCategory(Integer.parseInt(request.getParameter("category")));
            Long time=Long.parseLong(request.getParameter("time"));
            eventReport.setPlatform(request.getHeader("platform"));
            eventReport.setDeviceId(request.getHeader("deviceId"));
            eventReport.setUserId(request.getHeader("userId"));
            eventReport.setUserToken(request.getHeader("userToken"));
            eventReport.setChannel(request.getHeader("channel"));
            eventReport.setModel(request.getHeader("model"));
            eventReport.setClientVersion(request.getHeader("clientVersion"));
            eventReport.setNetwork(request.getHeader("network"));
            Date date=new Date(time);
            eventReport.setCreatedTime(date);
            int count =eventReportService.insertEventReprot(eventReport);
            if(count>0){
                response.setCode(1);
                response.setMsg("数据入库成功");
                response.setData(null);
            }
        }catch(Exception e){
            e.printStackTrace();
            response.setCode(20001);
            response.setMsg("参数错误！");
        }
        return  response;
    }

}
