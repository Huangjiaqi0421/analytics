package com.memebox.analytics.service;

import com.memebox.analytics.dao.EventReportDao;
import com.memebox.analytics.entity.EventMapping;
import com.memebox.analytics.entity.EventReport;
import com.memebox.analytics.entity.ReportInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Frank on 17/5/18.
 */
@Service
public class EventReportService {

    @Autowired
    private EventReportDao eventReportDao;
    @Autowired
    private EventMappingService eventMappingService;
    public int insertEventReprot(EventReport eventReport){
        /**
         * 匹配
         */
    //    List<EventMapping> mappingList= eventMappingService.getEventMappingsByName(eventReport.getEventName());
        /**
         * 解析属性
         */
        eventReport.parseProperty(eventMappingService.getEventMappingsByName(eventReport.getEventName()),eventReport.getProperty());
        return eventReportDao.insertEventReport(eventReport);
    }
}
