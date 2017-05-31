package com.memebox.analytics.cache;

import com.alibaba.fastjson.JSON;
import com.memebox.analytics.entity.EventMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Frank on 17/5/23.
 */
@Repository
public class RedisDao {
    @Autowired
    private StringRedisTemplate template;
    private RedisKeyValueTemplate keyValueTemplate;
    public  void set(String key,String value){
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key,value,5, TimeUnit.MINUTES);//1分钟过期
    }

    public String get(String key){
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }

    public void setModel(String key,Object object){
        if(object!=null) {
            String json = JSON.toJSONString(object);
            ValueOperations<String, String> ops = template.opsForValue();
            ops.set(key, json, 5, TimeUnit.MINUTES);//1分钟过期
        }
    }
    public <T> T getModel(String key,Class<T> type) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        String json=ops.get(key);
        T value=JSON.parseObject(json,type);
        return value;
    }
    public void setArray(String key,Object object){
        if(object!=null) {
            String json = JSON.toJSONString(object);
            ValueOperations<String, String> ops = template.opsForValue();
            ops.set(key, json, 5, TimeUnit.MINUTES);//1分钟过期
        }
    }
    public <T> List<T> getArray(String key, Class<T> type) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        String json=ops.get(key);
        List<T> value=JSON.parseArray(json,type);
        return value;
    }

}
