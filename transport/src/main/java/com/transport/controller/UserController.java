package com.transport.controller;

import com.transport.bean.User;
import com.transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/use")  //为什么不配置
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/useindex")
    public String index() {  //主界面
        return "user/index";
    }

    @RequestMapping("/login")
    public String login(String username, String password) {   //登录
        System.out.println("这里"+username+"    "+password);
        User user = userService.login(username, password);
//        System.out.println(user);
        if (user == null) {
            return "user/index";
        }
        return "main";
    }

    @RequestMapping("/register")
    public String register(String username, String tel, String password) { //注册
        if(username==""||tel==""||password==""){
            return "user/index";
        }
        else{
        User user = userService.ifhave(username);
        if (user == null) {
            userService.register(username, password, tel);
            return "user/index";
        } else
            System.out.println("用户名存在");
            return "main";
        }
    }

    //进入修改页面
    @RequestMapping("/upassword")
    public String update() {
        return "user/upassword";
    }

    @RequestMapping("/afterupdate")
    public String afterupdate(String username, String password, String tel) {
        User user = userService.confirmuse(username,tel);
        if(user!=null){
            userService.upassword(username,password,tel);
            return "user/index";
        }
        else
            return "user/upassword";
    }

}
