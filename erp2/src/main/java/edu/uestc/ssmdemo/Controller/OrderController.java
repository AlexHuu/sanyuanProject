package edu.uestc.ssmdemo.Controller;

import edu.uestc.ssmdemo.Convert.ConvertUtil;
import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by hu on 2018-04-23.
 */
@Controller
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "addOrder")
    public String addOrder(){
        return "order/addOrder";
    }
    @RequestMapping(value = "listOrder")
    public String listOrder(){
        return "order/listOrder";
    }

    @RequestMapping(value = "/insertorder")
    public String insertOrder(OrderTableVo orderTableVo){

        Ordertable ordertable = ConvertUtil.OrderTableVo2Ordertable(orderTableVo);
        UUID uuid = UUID.randomUUID();
        ordertable.setOrderno(uuid.toString());
        Date date = new Date();
        ordertable.setDate(date);
        ordertable.setUncompleted(ordertable.getCountofcloth());

        orderService.insertOrder(ordertable);
        return "redirect:/queryorder";
    }
    @RequestMapping(value = "/queryorder")
    public String queryOrderByCustomerNameAndDate(OrderVo orderVo,Model model){
        List<Ordertable> ordertables = orderService.queryOrderByCustomerNameAndDate(orderVo);
        model.addAttribute("ordertable",ordertables);
        return "order/listOrder";
    }
    @RequestMapping(value = "testentry")
    public String test(){
        return "order/dateselect";
    }

    @RequestMapping("deleteOrder")
    public String deleteOrder(String orderNo){
        orderService.deleteByOrderNo(orderNo);
        return "order/listOrder";
    }
}
