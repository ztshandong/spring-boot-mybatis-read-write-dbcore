package com.zhangtao.controller;

import com.alibaba.fastjson.JSON;
import com.zhangtao.domain.RedisUserInfo;

/**
 * Created by zhangtao on 2017/7/4.
 */
public class BaseController extends RedisBase implements IBaseController {
    @Override
    public RedisUserInfo checkToken4User(String token) {
        return super.checkToken4User(token);
    }
}
