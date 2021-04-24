package com.transport.controller;

import com.transport.bean.Admin;
import com.transport.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("adminindex")  //管理员登录页面
    public String index(){
//        System.out.println("执行到此");
        return "admin/index";
    }
    @RequestMapping("adminlogin")
    public String adminlogin(String username,String password){
        Admin admin=adminService.ifHave(username,password);
        if (admin!=null){
            return "main";
        }
        else return "admin/index";
    }
}
