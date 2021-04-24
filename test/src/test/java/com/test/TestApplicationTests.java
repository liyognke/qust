package com.test;

import com.test.bean.Student;
import com.test.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TestApplicationTests {

    @Autowired
    private StudentService studentService;
    @Test

    void contextLoads() {
        List<Student> all=studentService.selectAll();
        System.out.println(all);
    }

}
