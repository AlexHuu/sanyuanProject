package edu.uestc.ssmdemo.dao;

import edu.uestc.ssmdemo.entity.Tasktable;
import edu.uestc.ssmdemo.entity.TasktableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TasktableMapper {
    long countByExample(TasktableExample example);

    int deleteByExample(TasktableExample example);

    int deleteByPrimaryKey(String taskno);

    int insert(Tasktable record);

    int insertSelective(Tasktable record);

    List<Tasktable> selectByExample(TasktableExample example);

    Tasktable selectByPrimaryKey(String taskno);

    int updateByExampleSelective(@Param("record") Tasktable record, @Param("example") TasktableExample example);

    int updateByExample(@Param("record") Tasktable record, @Param("example") TasktableExample example);

    int updateByPrimaryKeySelective(Tasktable record);

    int updateByPrimaryKey(Tasktable record);
}