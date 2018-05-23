package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Convert.ConvertUtil;
import edu.uestc.ssmdemo.Convert.ProcessConvert;
import edu.uestc.ssmdemo.Model.TasktableVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.OrderService;
import edu.uestc.ssmdemo.service.TaskTableService;
import edu.uestc.ssmdemo.utils.QRCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;



/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class TaskTableController {

    /**
     * 主机IP地址：
     */
    private static final String hostIp="http://39.105.114.95:8080";

    @Autowired
    TaskTableService taskTableService;
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/inserttask")
    public void insertTask(TasktableVo tasktableVo) throws Exception {

        //Tasktable tasktable = ConvertUtil.TasktableVo2Tasktable(tasktableVo);

        //taskTableService.insertTask(tasktable);
    }

    @RequestMapping(value = "/gettaskbytaskno")
    public String getTaskByTaskNo(TasktableVo tasktableVo) throws Exception {
//        Tasktable tasktable = taskTableService.queryTaskByTaskNo(tasktableVo.getTaskno());
//
//        byte[] processBytes = tasktable.getProcess();
//        ProcessVo processObj = (ProcessVo)SerializeObjectTool.ReSerializeObject(processBytes);
//
//        System.out.println(processObj);
        return "test";
    }

    @RequestMapping("taskOperation")
    public String taskOperation(Model model, String orderNo) throws Exception {
        List<Tasktable> list = taskTableService.queryTaskByOrderNo(orderNo);
        for (Tasktable task:list
             ) {
            task.setProcess(ProcessConvert.covert(task.getProcess()));
        }
        model.addAttribute("tasks",list);
        model.addAttribute("orderNo",orderNo);
        return "task/listTask";
    }

    @RequestMapping("addBlank")
    public String addBlank(Model model, String orderNo){
        Ordertable orderTable = orderService.queryOrderByOrderNo(orderNo);
        model.addAttribute("order", orderTable);
        return "task/addTask";
    }

    @RequestMapping("addTask")
    public String addTask(Model model,TasktableVo tasktableVo) throws IOException {
        Tasktable tasktable = ConvertUtil.TasktableVo2Tasktable(tasktableVo);
        taskTableService.insertTask(tasktable);

        //修改订单匹数
        orderService.subClothOfOrder(tasktableVo.getOrderno(),tasktableVo.getCountofclothoftask());
        model.addAttribute("orderNo",tasktableVo.getOrderno());
        return "redirect:taskOperation";
    }

    @RequestMapping("getDetailInfo")
    public String getDetailInfo(Model model, String taskNo){
        Tasktable tasktable = taskTableService.queryTaskByTaskNo(taskNo);
        model.addAttribute("task",tasktable);
        return "task/attrJsP";
    }

    @RequestMapping("deleteTask")
    public String deleteTask(Model model, String taskNo, String orderNo){
        model.addAttribute("orderNo",orderNo);
        orderService.addClothOfOrder(taskNo,orderNo);
        taskTableService.deleteTaskByTaskNo(taskNo);
        return "redirect:taskOperation";
    }

    @RequestMapping("printTask")
    public ResponseEntity<byte[]> printTask(String taskNo) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("file",taskNo + ".jpeg");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //拼接二维码地址
        String URL =hostIp+"/ssmdemo/producer_process?taskno="+taskNo;
        QRCodeUtil.encode(URL,outputStream);
        return new ResponseEntity<byte[]>(outputStream.toByteArray(),headers, HttpStatus.CREATED);
    }

}
