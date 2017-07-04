package com.zhangtao.controller;

import com.zhangtao.domain.RedisUserInfo;

/**
 * Created by zhangtao on 2017/7/4.
 */
public interface IBaseController{
    RedisUserInfo checkToken4User(String token);
}
