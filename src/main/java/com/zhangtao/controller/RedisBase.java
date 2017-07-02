package main.java.com.zhangtao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created by zhangtao on 2017/7/2.
 */
public class RedisBase {
    @Autowired
    protected StringRedisTemplate template;

    protected ValueOperations<String, String> ops;

    protected void IniRedis() {
        if (ops == null)
            ops = template.opsForValue();
    }
}
