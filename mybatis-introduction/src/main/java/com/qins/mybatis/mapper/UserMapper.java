package com.qins.mybatis.mapper;

import com.qins.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper

public interface UserMapper {

//    mapperһ��
//    sql����id ��mapper�ӿ��еķ���һ��
//    ��-ʵ����-mapper�ӿ�-ӳ���ļ�

    int insertUser();
    void updateUser();
    void deleteUser();
    User getUserById();

    List<User> UserById();



}
