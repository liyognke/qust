package com.transport.mapper;

import com.transport.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    void addAdmin(@Param("username") String username,@Param("password") String password);
//    Admin selectAll();
    Admin ifHave(@Param("username")String username,@Param("password")String password);
}

