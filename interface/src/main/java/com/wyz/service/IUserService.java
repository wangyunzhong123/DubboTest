package com.wyz.service;

/**
 * Created by yzwang on 2017/8/22.
 */
public interface IUserService {

    /**
     * 登录方法
     * @return 是否登录成功
     */
    public boolean login(String username, String password);
}
