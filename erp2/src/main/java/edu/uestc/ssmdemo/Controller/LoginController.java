package edu.uestc.ssmdemo.Controller;


import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("home_page")
    public String home(){
        return "index";
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        return "login/login";
    }

    @RequestMapping("login")
    public String Login(Userinfo user, HttpSession httpSession){
        System.out.println(user.getUserPassword() + "   " + user.getUserPhoneno());
        Userinfo u = userService.login(user);
        if (u != null){
            //System.out.println("u不为空");
            httpSession.setAttribute("user",u);
            return "redirect:home_page";
        }
        return "forward:loginPage";
    }

    @RequestMapping("user_exit")
    public String User_exit(HttpSession session){
        session.removeAttribute("user");
        return "forward:loginPage";
    }

    //修改用户信息
    @RequestMapping("user_edit")
    public String User_edit(Model model){
        return "login/edit";
    }
    @RequestMapping("saveEditInfo")
    public String SaveEditInfo(Userinfo user,Model model,HttpSession session){
        String check = userService.checkUserPhone(user);
        if (check.equals("yes")){
            //可以更新
            userService.saveEdit(user);
            session.removeAttribute("user");
            session.setAttribute("user",user);
            System.out.println(user.getUserId());
            return "authority_management/success";
        }else{
            //不可以更新
            model.addAttribute("msg","用户名已经被使用,不能使用");
            return "login/edit";
        }
    }

}
