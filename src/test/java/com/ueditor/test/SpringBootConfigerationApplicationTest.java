package com.ueditor.test;

import com.example.Bean.User;
import com.example.Bean.Vip;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MrChang
 * @create 2019-12-20 16:00
 * @description springboot单元测试  可以在测试期间类似编码一样自动注入等容器的功能
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootConfigerationApplicationTest.class)
@ComponentScan(basePackages = {"com.example"})
public class SpringBootConfigerationApplicationTest {
    @Autowired
    User user;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testService(){
        boolean b = ioc.containsBean("testService");
        System.out.println(b);
    }

    @Test
    public void contextLoads(){
        System.out.println(user);
    }

}
