package com.memebox.analytics.dao;

import com.memebox.analytics.entity.EventReport;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Frank on 17/5/17.
 */
@Mapper
public interface EventReportDao {

    int insertEventReport(EventReport eventReport);
}
