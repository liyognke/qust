package com.transport;

import com.transport.bean.Admin;
import com.transport.controller.UserController;
import com.transport.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransportApplicationTests {
@Autowired
private AdminService adminService;
    @Test
    void contextLoads() {
//        Admin admin= adminService.selectAll();
//        adminService.selectAll();
//        adminService.addAdmin("liyongke","asidjasoidjas");
//        System.out.println(admin);
    }

}
