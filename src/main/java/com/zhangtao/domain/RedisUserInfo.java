package com.zhangtao.domain;

/**
 * Created by zhangtao on 2017/7/4.
 */
public class RedisUserInfo {
    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public RedisUserInfo() {
    }

    public Long getdMid() {

        return dMid;
    }

    public void setdMid(Long dMid) {
        this.dMid = dMid;
    }

    public String getdAccount() {
        return dAccount;
    }

    public void setdAccount(String dAccount) {
        this.dAccount = dAccount;
    }

    public Integer getmFlag() {
        return mFlag;
    }

    public void setmFlag(Integer mFlag) {
        this.mFlag = mFlag;
    }

    public Integer getmMultiLogin() {
        return mMultiLogin;
    }

    public void setmMultiLogin(Integer mMultiLogin) {
        this.mMultiLogin = mMultiLogin;
    }

    public Long dId;
    public Long dMid;
    public String dAccount="";
    public Integer mFlag;
    public Integer mMultiLogin;
}
