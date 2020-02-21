package com.toulan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 * @Author LOL_toulan
 * @Time 2020/2/21 11:22
 * @Message
 */
@Controller
@RequestMapping("session")
@SessionAttributes("msg")
public class SessionAttributeControllers {

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes....");
        model.addAttribute("msg", "犬来八荒(成果)");
        System.out.println("存入了数据");
        return "success";
    }


    //Model 是 spring 提供的一个接口，该接口有一个实现类 ExtendedModelMap
    //该类继承了 ModelMap，而 ModelMap 就是 LinkedHashMap 子类
    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){
        System.out.println();
        System.out.println("getSessionAttributes....");
        String msg = (String) model.get("msg");
        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus sessionStatus) {
        System.out.println("delSessionAttributes....");
        sessionStatus.setComplete();
        return "success";
    }

}
