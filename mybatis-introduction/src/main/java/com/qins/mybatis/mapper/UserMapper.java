package com.qins.mybatis.mapper;

import com.qins.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper

public interface UserMapper {

//    mapper一致
//    sql语句的id 与mapper接口中的方法一致
//    表-实体类-mapper接口-映射文件

    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById();

    List<User> UserById();



}
