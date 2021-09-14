package com.itheima.test.Dao;

import com.itheima.dao.ItemDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void finAllTest(){

        //创建工厂
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //2. 问工厂要对象
        ItemDao dao = applicationContext.getBean(ItemDao.class);
        //调用方法
        System.out.println(dao.findAll());
    }
}
