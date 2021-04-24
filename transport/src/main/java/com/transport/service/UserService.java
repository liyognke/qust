package com.transport.service;

import com.transport.bean.User;
import com.transport.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //登录
    public User login(String username,String password){
        User user=userMapper.login(username,password);
        return user;
    }
    //注册
    public void register(String username,String password,String tel){
        userMapper.register(username,password,tel);
    }
    //判断用户名是否存在
    public User ifhave(String username){
        User user =userMapper.ifhave(username);
        return user;
    }
    //修改密码
    public void upassword(String username,String password,String tel){
        userMapper.upassword(username,password,tel);
    }
    public User confirmuse(String username,String tel){
        User user= userMapper.confirmuse(username,tel);
        return user;
    }
}
