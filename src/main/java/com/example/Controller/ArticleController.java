package com.example.Controller;

import com.example.common.Msg;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author MrChang
 * @create 2019-12-11 16:56
 */
@Controller
public class ArticleController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){
        //List<Phone> type1 = phoneService.getPhoneByType1();
        //PageHelper.startPage(pageNum, 10);
        //List<Phone> type1 = phoneService.getPhoneByType1();
        //PageInfo<Phone> page = new PageInfo<Phone>(type1,6);
        //return Msg.success().add("pageInfo", "page");



       List<Map<String, Object>> list =jdbcTemplate.queryForList("select * from article");
       return list.get(0);
    }
}
