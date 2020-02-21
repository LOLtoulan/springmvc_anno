package com.toulan.controller;

import com.toulan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

/**
 * @Author LOL_toulan
 * @Time 2020/2/18 10:41
 * @Message
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/beans")
    @ResponseBody
    public String beans(User user){
        System.out.println("用户名：" + user);
        return "success";
    }


    /**
     * testRequestParam
     * @param username
     * @param age
     * @param email
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testServletAPI(@RequestParam(value = "name",required = true) String username
                                ,@RequestParam(value = "age",required = false) Integer age,
                                 String email) {
        System.out.println(username+"=="+age+"=="+email);
        return "success";
    }

    /**
     * testRequestBody
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody(required = false) String body) {
        System.out.println(body);
        return "success";
    }

    /**
     * testResponseBody
     * @param user
     * @return
     */
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public User testResponseBody(User user){
        System.out.println("用户名：" + user);
        return user;
    }

    /**
     * testResponseBody
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    @ResponseBody
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("用户Id:" + id);
        return "success";
    }

    /**
     *
     * @param requestHeader
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept", required=false)String requestHeader){
        System.out.println(requestHeader);
        return "success";
    }


    /**
     * 设置cookie
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/setCookieValue")
    public String setCookieValue(HttpServletRequest request,
                                 HttpServletResponse response){

        Cookie cookie = new Cookie("beauty", "chengguo");
        response.addCookie(cookie);
        return "success";
    }


    /**
     * 获取cookie
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="beauty",required=false)
                                         String cookieValue){

        System.out.println(cookieValue);
        return "success";
    }

/*

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {

        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser() {
        System.out.println("showUser执行了");
    }

*/

/*    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user) {

        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public User showUser(String username, Integer age) {
        //通过username查询数据库中的信息(模拟)
        User user = new User();
        user.setUsername(username);
        user.setPassword("loltoulan");
        user.setAge(age);
        user.setDate(new Date());
        return user;
    }*/

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("show") User user) {

        System.out.println("testModelAttribute执行了");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String username, Integer age,Map<String,User> userMap) {
        //通过username查询数据库中的信息(模拟)
        User user = new User();
        user.setUsername(username);
        user.setPassword("loltoulan");
        user.setAge(age);
        user.setDate(new Date());

        userMap.put("show", user);

    }
}
