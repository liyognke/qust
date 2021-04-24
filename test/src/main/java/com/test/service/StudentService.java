package com.test.service;

import com.test.bean.Student;
import com.test.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAll(){
       List<Student> allStudent= studentMapper.selectAll();
        System.out.println(allStudent);
        return allStudent;
    }


}
