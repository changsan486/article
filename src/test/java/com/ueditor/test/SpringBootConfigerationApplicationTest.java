package com.ueditor.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MrChang
 * @create 2019-12-20 16:00
 * @description springboot单元测试  可以在测试期间类似编码一样自动注入等容器的功能
 */


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootConfigerationApplicationTest.class)
@ComponentScan(basePackages = {"com.admin"})
public class SpringBootConfigerationApplicationTest {

    @Test
    public void contextLoads(){
    }

}
