package com.cloud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.pojo.Register;
import com.cloud.pojo.User;

public interface UserService extends IService<User>{

    //登录的方法
    String login(User member);
    User login1(User member);
    //注册的方法
    void register(Register registerVo);
    public String getUserNickname();

}
