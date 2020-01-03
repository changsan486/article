package com.admin.Controller;

import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ldb on 2017/4/9.
 */
@Controller
public class UEdictorController {


//    @RequestMapping("/")
//    private String showPage(){
//        return "index";
//    }

    @RequestMapping(value="/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
//    @RequestMapping("/edit")
//    public String edit(){
//        return "starter";
//    }
//    @RequestMapping("/type1")
//    @ResponseBody
//    public Msg getType1(@RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum) {
//        //List<Phone> type1 = phoneService.getPhoneByType1();
//        //return Msg.success().add("type1", type1);
//        PageHelper.startPage(pageNum, 10);
//        List<Author> type1 = phoneService.getPhoneByType1();
//        PageInfo<Phone> page = new PageInfo<Phone>(type1,6);
//        return Msg.success().add("pageInfo", "page");
//    }
}