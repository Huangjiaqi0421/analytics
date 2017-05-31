package com.memebox.analytics.dao;

import com.memebox.analytics.entity.EventCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Frank on 17/5/8.
 */
@Mapper
public interface EventCategoryDao {
    /**
     * 插入事件
     * @param eventCategory
     * @return
     */
    int insertEventCategory(EventCategory eventCategory);
//    /**
//     * 查询所有事件
//     * @param offset
//     * @param limit
//     * @return
//     */
//    List<EventCategory> queryAll(@Param("offset") int offset,@Param("limit") int limit);
    

}
