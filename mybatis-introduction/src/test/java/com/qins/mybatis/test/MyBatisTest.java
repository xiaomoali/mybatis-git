package com.qins.mybatis.test;

import com.qins.mybatis.mapper.UserMapper;
import com.qins.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.alibaba.druid.pool.DruidDataSource;

public class MyBatisTest {

    @Test
    public void testMyBatis() throws IOException {
        //加载核心配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SQLsessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory= sqlSessionFactoryBuilder.build(in);


        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        int result=mapper.insertUser();


//        sqlSession.commit();
        System.out.println("result:"+result);

//        int b=10;
//        int a.txt=20;
//
//        Assertions.assertEquals(a.txt+b,30);

    }
    @Test
    public void tsetUpdate() throws  IOException{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void tsetDelete() throws  IOException{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
    }

    @Test
    public void tsetgetUserById() throws  IOException{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
         User user= mapper.getUserById();
         System.out.println(user);
    }

    @Test
    public void tsetUserById() throws  IOException{
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession= sqlSessionFactory.openSession(true);
        UserMapper mapper= sqlSession.getMapper(UserMapper.class);
        List<User> list= mapper.UserById();
//        list.forEach(user -> System.out.println(list));

        System.out.println(list);
    }

}
