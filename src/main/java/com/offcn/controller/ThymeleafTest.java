package com.offcn.controller;

import com.offcn.pojo.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafTest {
    @RequestMapping("/t1")
    public String t1(Model model) {
        model.addAttribute("a", "aa");
        return "index";
    }
    @RequestMapping("/t2")
    public String t2(Model model) {
        List list = new ArrayList();
        UserInfo u1 = new UserInfo("张三", 18);
        UserInfo u2 = new UserInfo("张e", 17);
        UserInfo u3 = new UserInfo("张s", 19);
        list.add(u1);
        list.add(u2);
        list.add(u3);
        model.addAttribute("list", list);
        return "index";
    }
    @RequestMapping("/t3")
    public String t3(Model model){
        String a = "张三";
        model.addAttribute("name",a);
        return "index";
    }
    @RequestMapping("/t4")
    public String t4(Model model){
        String a = "a";
        String b = "b";
        model.addAttribute("a",a);
        model.addAttribute("b",b);
        return "index";
    }
    @RequestMapping("/t5")
    public String t5(Model model){
        Date date = new Date();
        double num = 123.456d;
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n\n";
        model.addAttribute("date",date);
        model.addAttribute("num",num);
        model.addAttribute("str",str);

        return "index";
    }
}
