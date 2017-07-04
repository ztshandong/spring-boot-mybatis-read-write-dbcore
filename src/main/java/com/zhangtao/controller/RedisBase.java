package com.zhangtao.controller;

import com.alibaba.fastjson.JSON;
import com.zhangtao.domain.RedisUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created by zhangtao on 2017/7/2.
 */
public class RedisBase {
    @Autowired
    protected StringRedisTemplate template;
//    @Autowired
    protected RedisUserInfo redisUserInfo;

    protected ValueOperations<String, String> ops;

    protected void IniRedis() {
        if (ops == null)
            ops = template.opsForValue();
        if (redisUserInfo == null)
            redisUserInfo = new RedisUserInfo();
    }

    public  RedisUserInfo checkToken4User(String token){
        this.IniRedis();
        if (template.hasKey(token)) {
            redisUserInfo = JSON.parseObject(ops.get(token), RedisUserInfo.class);
        } else {

        }
        return redisUserInfo;
    }
}
