package com.admin.Controller;

import com.admin.Bean.Article;
import com.admin.Service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

/**
 * @author MrChang
 * @create 2019-12-11 16:56
 */
@Controller
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping({"/","/index"})
    public String test(Model model, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Article> article = articleService.queryAll();
        PageInfo<Article> pageInfo = new PageInfo<Article>(article,10);
        model.addAttribute("pageInfo",pageInfo);

        //获得当前页
        model.addAttribute("pageNum", pageInfo.getPageNum());
        //获得一页显示的条数
        model.addAttribute("pageSize", pageInfo.getPageSize());
        //是否是第一页
        model.addAttribute("isFirstPage", pageInfo.isIsFirstPage());
        //获得总页数
        model.addAttribute("totalPages", pageInfo.getPages());
        //是否是最后一页
        model.addAttribute("isLastPage", pageInfo.isIsLastPage());
        model.addAttribute("total",pageInfo.getTotal());
        System.out.println(model);
        return "index";
    }

    @RequestMapping("/edit")
    public String edit(){
        return "starter";
    }

    @RequestMapping("/main")
    public String main(Model model,@RequestParam(value = "id",required=false) Integer id){
        System.out.println(id);
        Article article = articleService.queryById(id);
        model.addAttribute("main",article);
        return "simple_page";
    }
    @RequestMapping("/frontIndex")
    public String frontIndex(Model model){
        List<Article> article = articleService.queryAll();
        model.addAttribute("main",article);
        return "frontIndex";
    }
    @RequestMapping("/readMore")
    public String readMore(Model model,@RequestParam(value = "id",required=false) Integer id){
        Article article = articleService.queryById(id);
        model.addAttribute("main",article);
        return "frontArt";
    }
}
