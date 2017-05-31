package com.memebox.analytics.service;

import com.memebox.analytics.dao.EventCategoryDao;
import com.memebox.analytics.entity.EventCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Frank on 17/5/9.
 */
@Service
public class EventCategoryService {
    @Autowired
    EventCategoryDao eventCategoryDao;
    public int addEventCategory(EventCategory eventCategory){
        return eventCategoryDao.insertEventCategory(eventCategory);
    }
}
