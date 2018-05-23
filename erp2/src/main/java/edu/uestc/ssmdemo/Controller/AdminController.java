package edu.uestc.ssmdemo.Controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import edu.uestc.ssmdemo.entity.Producerinfo;
import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.service.ProducerService;
import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    ProducerService producerService;

    @RequestMapping("addAdmin")
    public String AddAdmin(){
        return "authority_management/add";
    }

    @RequestMapping("addsubmit")
    public String AddSubmit(Userinfo user,Model model){
        String check = userService.register(user);
        if (check.equals("yes")){
            return "authority_management/success";//跳转到注册成功页面
        }else if (check.equals("no")){
            model.addAttribute("msg","用户名已经被使用,不能使用");
        }
        return "forward:addAdmin";
    }

    //管理员列表
    @RequestMapping("listAdmin")
    public String ListAdmin(Model model){
        List<Userinfo> list = userService.getListAmind();
        model.addAttribute("list",list);
        return "authority_management/list";
    }

    @RequestMapping("findBynameOrPhone")
    public String FindBynameOrPhone(Model model, Userinfo user){
        List<Userinfo> list = userService.findBynameOrPhone(user);
        model.addAttribute("list",list);
        return "authority_management/list";
    }
    @RequestMapping("editAdmin")//修改管理员信息
    public String EditAdmin(Model model, @RequestParam(value = "userId") String userId){
        System.out.println(userId);
        Userinfo user = userService.getAdminById(Long.valueOf(userId));
        model.addAttribute("user",user);
        return "authority_management/edit";
    }
    @RequestMapping("deleteAdmin")//删除管理员
    public String DeleteAdmin(@RequestParam(value = "userId") String userId){
        userService.deleteById(Long.valueOf(userId));
        return "redirect:listAdmin";
    }

    @RequestMapping("saveEdit")
    public String SaveEdit(Userinfo user){
        userService.saveEdit(user);
        return "authority_management/success";
    }

    //修改生产者登录信息
    @RequestMapping("addPro")
    public String  addPro(){
        return "producer/add";
    }

    @RequestMapping("proaddsubmit")
    public String proaddsubmit(Producerinfo producer, Model model){
        String check = producerService.register(producer);
        if (check.equals("yes")){
            return "producer/success";//跳转到注册成功页面
        }else if (check.equals("no")){
            model.addAttribute("msg","用户名已经被使用,不能使用");
        }
        return "producer/add";
    }
    //生产者列表
    @RequestMapping("listPro")
    public String listPro(Model model){
        List<Producerinfo> list = producerService.getListPro();
        model.addAttribute("list",list);
        return "producer/list";
    }
    //删除生产者
    @RequestMapping("deletePro")
    public String deletePro(@RequestParam(value = "Id") String Id){
        producerService.deleteById(Long.valueOf(Id));
        return "redirect:listPro";
    }
    //通过电话或者姓名查找生产者
    @RequestMapping("findBynameOrPhonePro")
    public String findBynameOrPhonePro(Model model, Producerinfo producer){
        List<Producerinfo> list = producerService.findBynameOrPhone(producer);
        model.addAttribute("list",list);
        return "producer/list";
    }

}
