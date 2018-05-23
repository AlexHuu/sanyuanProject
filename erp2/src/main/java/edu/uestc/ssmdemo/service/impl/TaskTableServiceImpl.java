package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.dao.TasktableMapper;
import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.entity.TasktableExample;
import edu.uestc.ssmdemo.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by hu on 2018-04-23.
 */
@Service
public class TaskTableServiceImpl implements TaskTableService {
    @Autowired
    TasktableMapper tasktableMapper;


    public void insertTask(Tasktable tasktable) {
        tasktableMapper.insert(tasktable);
    }


    public Tasktable queryTaskByTaskNo(String taskno) {
        Tasktable tasktable = tasktableMapper.selectByPrimaryKey(taskno);
        return tasktable;
    }

    public List<Tasktable> queryTaskByOrderNo(String orderNo) {
        TasktableExample example = new TasktableExample();
        example.createCriteria().andOrdernoEqualTo(orderNo);
        List<Tasktable> list = tasktableMapper.selectByExample(example);

        return list;
    }

    public void deleteTaskByTaskNo(String taskNo) {
        tasktableMapper.deleteByPrimaryKey(taskNo);
    }

    public void updataStatusByTaskNo(String taskno, String process) {
        Tasktable tasktable = tasktableMapper.selectByPrimaryKey(taskno);
        if (tasktable != null){
            tasktable.setCurstate(process);
            tasktableMapper.updateByPrimaryKey(tasktable);
        }
    }
}
