package com.transport.mapper;

import com.transport.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User login(@Param("username") String username,@Param("password") String password);
    void register(@Param("username") String username, @Param("password") String password,@Param("tel")String tel);
    User ifhave(@Param("username") String username);
    void upassword(@Param("username") String username,@Param("password")String password,@Param("tel") String tel);
    User confirmuse(@Param("username")String username,@Param("tel")String tel);
}


