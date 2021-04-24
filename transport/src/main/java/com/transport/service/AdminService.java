package com.transport.service;

import com.transport.bean.Admin;
import com.transport.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public void addAdmin(String username, String password) {

        adminMapper.addAdmin(username, password);
    }
    public Admin ifHave(String username,String password){
        Admin admin=adminMapper.ifHave(username,password);
        return admin;
    }
//    public Admin selectAll() {
//
//        Admin admin = adminMapper.selectAll();
//
//        return admin;
//    }
}
