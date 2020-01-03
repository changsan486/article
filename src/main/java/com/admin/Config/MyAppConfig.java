package com.admin.Config;

import com.admin.Service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MrChang
 * @create 2019-12-23 14:11
 * @description
 */
@Configuration//指明当前类是一个配置类，用来替代spring中的.xml配置文件
public class MyAppConfig {

    @Bean//将方法中的返回值IOC容器中，容器中这个组件默认ID就是本方法名
    public TestService testService(){

        return new TestService();
    }
}
