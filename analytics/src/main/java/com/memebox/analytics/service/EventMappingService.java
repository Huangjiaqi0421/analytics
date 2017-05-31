package com.memebox.analytics.service;

import com.memebox.analytics.cache.RedisDao;
import com.memebox.analytics.dao.EventMappingDao;
import com.memebox.analytics.entity.EMList;
import com.memebox.analytics.entity.EventMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Frank on 17/5/17.
 */
@Service
public class EventMappingService {
    @Autowired
    EventMappingDao eventMappingDao;
    @Autowired
    RedisDao redisDao;
    /***
     * 根据EventName 获取Mapping信息
     * @param eventName
     * @return
     */
    public  List<EventMapping> getEventMappingsByName(String eventName){
        List<EventMapping> mappings=null;
        mappings=redisDao.getArray(eventName,EventMapping.class);
        if(mappings==null){
            /**
             * 数据库取数据
             */
            mappings= eventMappingDao.getEventMappingsByName(eventName);
            redisDao.setArray(eventName,mappings);
        }
        return mappings;
    }
    public List<EventMapping> getMappingList(){
        return eventMappingDao.getMappingList();
    }

}
