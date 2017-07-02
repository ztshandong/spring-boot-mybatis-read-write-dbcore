package main.java.com.zhangtao.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangtao on 2017/6/30.
 */
@FeignClient("snowflake")
public interface SnowFlake {
    @RequestMapping("/getid/")
    long getid();
}
