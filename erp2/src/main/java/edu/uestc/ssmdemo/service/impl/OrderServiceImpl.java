package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.Model.OrderVo;
import edu.uestc.ssmdemo.dao.OrdertableMapper;
import edu.uestc.ssmdemo.dao.TasktableMapper;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.entity.OrdertableExample;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.service.OrderService;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hu on 2018-04-23.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrdertableMapper ordertableMapper;
    @Autowired
    TasktableMapper tasktableMapper;


    public int insertOrder(Ordertable ordertable) {
        int insertId = ordertableMapper.insert(ordertable);
        return insertId;
    }


    public List<Ordertable> queryOrderByCustomerNameAndDate(OrderVo orderVo) {
        List<Ordertable> ordertables = ordertableMapper.queryOrderByCustomerNameAndDate(orderVo);
        return ordertables;
    }

    public Ordertable queryOrderByOrderNo(String orderNo) {
        Ordertable ordertable = ordertableMapper.selectByPrimaryKey(orderNo);
        return ordertable;
    }

    public void deleteByOrderNo(String orderNo) {
        ordertableMapper.deleteByPrimaryKey(orderNo);
    }

    public void subClothOfOrder(String orderno, String countofclothoftask) {
        Ordertable ordertable = ordertableMapper.selectByPrimaryKey(orderno);
        if (orderno != null){
            double v = ordertable.getCountofcloth() - Double.valueOf(countofclothoftask);
            ordertable.setCountofcloth(v);
        }
        ordertableMapper.updateByPrimaryKey(ordertable);
    }

    public void addClothOfOrder(String taskNo, String orderNo) {
        Ordertable ordertable = ordertableMapper.selectByPrimaryKey(orderNo);
        Tasktable tasktable = tasktableMapper.selectByPrimaryKey(taskNo);
        if (tasktable != null && ordertable != null){
            double v = ordertable.getCountofcloth() + Double.valueOf(tasktable.getCountofclothoftask());
            ordertable.setCountofcloth(v);
            ordertableMapper.updateByPrimaryKey(ordertable);
        }
    }
}
