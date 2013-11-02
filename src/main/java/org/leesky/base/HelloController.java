package org.leesky.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "test/index";
    }

    @RequestMapping(value = "/springmvc/helloworld", method = RequestMethod.GET)
    public String helloworld(Model model) {
        model.addAttribute("message", "艹地例子演示成功啦...");
        return "login/hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginworld(Model model) {
        model.addAttribute("message", "艹地例子演示成功啦...");
        return "login/login_soft";
    }
    @RequestMapping(value = "userlogin", method = RequestMethod.POST)
    public String login(Model model) {
        model.addAttribute("message", "艹地例子演示成功啦........艹地例子.");
        return "test/test";
    }
}