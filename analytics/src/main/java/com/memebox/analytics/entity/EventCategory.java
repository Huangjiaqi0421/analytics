package com.memebox.analytics.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Frank on 17/5/8.
 */
public class EventCategory implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    /**
     * 事件名称
     */
    private String eventName;
    /**
     * 事件分组
     */
    private String groupName;
    /**
     * 事件类型
     */
    private int category;
    /**
     *别名
     */
    private int alias;
    /**
     * 描述
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "EventCategory{" +
                "id=" + id +
                ", eventName='" + eventName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
