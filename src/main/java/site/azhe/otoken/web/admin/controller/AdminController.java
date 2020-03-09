package site.azhe.otoken.web.admin.controller;

import org.bouncycastle.math.ec.ScaleYPointMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import site.azhe.otoken.web.admin.service.AdminService;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;
    /**
     * 跳转登录页
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login(){
        String json = adminService.login("test@163.com", "123456");
        System.out.println(json);
        return "index";
    }
}
