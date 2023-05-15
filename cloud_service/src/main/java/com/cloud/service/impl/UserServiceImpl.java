package com.cloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.dao.mapper.UserMapper;
import com.cloud.pojo.Register;
import com.cloud.pojo.User;
import com.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public User login1(User user) {
        return null;
    }

    @Override
    public void register(Register register) {
        String account = register.getAccount();
        String nickname = register.getNickname();
        String password = register.getPassword();
        //判断账号是否重复
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("account", account);
        Integer count = baseMapper.selectCount(wrapper);
        /*if (count > 0) {
            throw new SpaceException(20001, "手机号已存在，注册失败！");
        }*/
        //数据添加数据库中
        User user = new User();
        user.setAccount(account);
        user.setNickname(nickname);
        /*user.setPassword(MD5.encrypt(password));//密码需要加密的*/
        baseMapper.insert(user);
    }

    public String getUserNickname() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("account","kkk");
        return userMapper.selectOne(queryWrapper).getNickname();
    }
}
