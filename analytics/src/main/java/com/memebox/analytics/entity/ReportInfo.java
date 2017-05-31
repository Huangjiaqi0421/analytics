package com.memebox.analytics.entity;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * Created by Frank on 17/5/18.
 */
public class ReportInfo {
    String property;
    String category;
    String time;
    String eventName;
    public  String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
