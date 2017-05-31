package com.memebox.analytics.dao;

import com.memebox.analytics.entity.EventMapping;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frank on 17/5/17.
 */
@Mapper
public interface EventMappingDao {

    ArrayList<EventMapping> getEventMappingsByName(String eventName);
    List<EventMapping> getMappingList();

}
