package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.entity.Tasktable;

import java.util.List;


/**
 * Created by hu on 2018-04-23.
 */
public interface TaskTableService {
    void insertTask(Tasktable tasktable);
    Tasktable queryTaskByTaskNo(String taskno);

    List<Tasktable> queryTaskByOrderNo(String orderNo);

    void deleteTaskByTaskNo(String taskNo);

    void updataStatusByTaskNo(String taskno, String process);
}
