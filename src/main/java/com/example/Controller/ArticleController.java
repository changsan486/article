package com.example.Controller;

import com.example.Bean.Article;
import com.example.Service.ArticleService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author MrChang
 * @create 2019-12-11 16:56
 */
@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/" +
            "")
    public String test(Model model){
        List<Article> article = articleService.queryAll();
        model.addAttribute("article",article);
        System.out.println(model);
        return "index";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "starter";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){




       List<Map<String, Object>> list =jdbcTemplate.queryForList("select * from article");
       return list.get(0);
    }
}
