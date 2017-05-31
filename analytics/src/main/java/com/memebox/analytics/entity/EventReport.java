package com.memebox.analytics.entity;

import com.alibaba.fastjson.JSON;
import org.apache.tomcat.util.buf.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Frank on 17/5/17.
 */
public class EventReport {
    private long id;
    private int category;
    private String eventName;
    private String property;
    private Date createdTime;
    private String userId;
    private String userToken;
    private String deviceId;
    private String platform;
    private String channel;
    private String model;
    private String clientVersion;
    private String systemVersion;
    private String url;
    private String refererurl;
    private String browser;
    private String useragent;
    private Date systemTime;
    private String network;
    private String extra1;
    private String extra2;
    private String extra3;
    private String extra4;
    private String extra5;
    private String extra6;
    private String extra7;
    private String extra8;
    private String extra9;
    private String extra10;
    private String extra11;
    private String extra12;
    private String extra13;
    private String extra14;
    private String extra15;
    private String extra16;
    private String extra17;
    private String extra18;
    private String extra19;
    private String extra20;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getRefererurl() {
        return refererurl;
    }

    public void setRefererurl(String refererurl) {
        this.refererurl = refererurl;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getUseragent() {
        return useragent;
    }

    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    public Date getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    public String getExtra4() {
        return extra4;
    }

    public void setExtra4(String extra4) {
        this.extra4 = extra4;
    }

    public String getExtra5() {
        return extra5;
    }

    public void setExtra5(String extra5) {
        this.extra5 = extra5;
    }

    public String getExtra6() {
        return extra6;
    }

    public void setExtra6(String extra6) {
        this.extra6 = extra6;
    }

    public String getExtra7() {
        return extra7;
    }

    public void setExtra7(String extra7) {
        this.extra7 = extra7;
    }

    public String getExtra8() {
        return extra8;
    }

    public void setExtra8(String extra8) {
        this.extra8 = extra8;
    }

    public String getExtra9() {
        return extra9;
    }

    public void setExtra9(String extra9) {
        this.extra9 = extra9;
    }

    public String getExtra10() {
        return extra10;
    }

    public void setExtra10(String extra10) {
        this.extra10 = extra10;
    }

    public String getExtra11() {
        return extra11;
    }

    public void setExtra11(String extra11) {
        this.extra11 = extra11;
    }

    public String getExtra12() {
        return extra12;
    }

    public void setExtra12(String extra12) {
        this.extra12 = extra12;
    }

    public String getExtra13() {
        return extra13;
    }

    public void setExtra13(String extra13) {
        this.extra13 = extra13;
    }

    public String getExtra14() {
        return extra14;
    }

    public void setExtra14(String extra14) {
        this.extra14 = extra14;
    }

    public String getExtra15() {
        return extra15;
    }

    public void setExtra15(String extra15) {
        this.extra15 = extra15;
    }

    public String getExtra16() {
        return extra16;
    }

    public void setExtra16(String extra16) {
        this.extra16 = extra16;
    }

    public String getExtra17() {
        return extra17;
    }

    public void setExtra17(String extra17) {
        this.extra17 = extra17;
    }

    public String getExtra18() {
        return extra18;
    }

    public void setExtra18(String extra18) {
        this.extra18 = extra18;
    }

    public String getExtra19() {
        return extra19;
    }

    public void setExtra19(String extra19) {
        this.extra19 = extra19;
    }

    public String getExtra20() {
        return extra20;
    }

    public void setExtra20(String extra20) {
        this.extra20 = extra20;
    }

    /**
     * 解析属性
     * @param mappings
     * @param property
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public void parseProperty(List<EventMapping> mappings, String property){
        Map<String,String> map= (Map<String, String>) JSON.parse(property);
        try {
            //循环所有属性
            for (Map.Entry<String, String> entry : map.entrySet()) {
                //取出property 的key(真实属性名)
                String key = entry.getKey();
                String mapping="";
                for (EventMapping eventMapping : mappings) {
                    if(eventMapping.getProperty().equals(key)) {
                         mapping = eventMapping.getMapping();
                    }
                }
                if(!mapping.equals("")) {
                    String methodName="set" + toUpperCaseFirstOne(mapping);
                    Method method = this.getClass().getMethod(methodName, String.class);
                    method.invoke(this,entry.getValue());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 首字母大写
     * @param s
     * @return
     */
    public static String toUpperCaseFirstOne(String s){
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
}
