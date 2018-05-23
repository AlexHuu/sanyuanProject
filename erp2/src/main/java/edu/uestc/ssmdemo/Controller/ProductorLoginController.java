package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.entity.Producerinfo;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.ProducerService;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("")
//注意：action的请求必须以"producer_"开头，否者会出现拦截
public class ProductorLoginController {

    @Autowired
    ProducerService producerService;
    @Autowired
    TaskTableService taskTableService;

    @RequestMapping("producer_logPage")
    public String pro_login_page(){
        return "producer/login";
    }

    @RequestMapping("producer_log")
    public String productor_login(Producerinfo producer, HttpSession httpSession){
        //跳转到操作页面
        Producerinfo u = producerService.login(producer);
        if (u != null){
            //System.out.println("u不为空");
            httpSession.setAttribute("producer",u);
            String taskno = (String) httpSession.getAttribute("taskno");
            if (taskno != null){
                return "redirect:producer_process?taskno=" + taskno;
            }else {
                return "producer/error";
            }
        }
        return "forward:producer_logPage";
    }

    @RequestMapping("producer_process")
    public String process(Model model, HttpSession httpSession, @RequestParam(value = "taskno") String taskno){
        //需要根据缸号，获取task信息
        if (taskno == null){
            taskno = (String) httpSession.getAttribute("taskno");
        }
        if (taskno != null){
            Tasktable tasktable = taskTableService.queryTaskByTaskNo(taskno);
            if (tasktable != null){
                //需要根据处理流程和当前状态获得process，传回页面
                model.addAttribute("task",tasktable);
                boolean[] isProcess = new boolean[11];
                boolean[] processed = new boolean[11];
                String[] ps = tasktable.getProcess().split(",");
                String curstate = tasktable.getCurstate();
                boolean falg = false;
                for (String s:ps
                     ) {
                    if (curstate.equals(s))
                        falg = true;
                    isProcess[Integer.valueOf(s)] = true;
                }
                if (falg){
                    for (String s:ps
                            ) {
                        processed[Integer.valueOf(s)] = true;
                        if (curstate.equals(s)) break;
                    }
                }
                model.addAttribute("isProcess",isProcess);
                model.addAttribute("processed",processed);
                httpSession.removeAttribute("taskno");
                return "producer/process";
            }
        }
        return "producer/error";
    }

    @RequestMapping("producer_pro")
    public String producer_pro(String taskno, String process){
        taskTableService.updataStatusByTaskNo(taskno,process);
        return "producer/success";
    }

}
