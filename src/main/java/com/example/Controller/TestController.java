package com.example.Controller;

import com.example.Bean.User;
import com.example.common.Msg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrChang
 * @create 2019-12-23 11:24
 * @description
 */
@RestController
public class TestController {

    @Value("${user.userName}")
    private String name;

    @RequestMapping("/cs")
    public String cs(){
        return "Hello"+name;
    }


}
