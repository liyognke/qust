package com.test.mapper;

import com.test.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  //持久层
public interface StudentMapper {

    List<Student> selectAll();

}
