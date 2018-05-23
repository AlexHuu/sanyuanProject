package edu.uestc.ssmdemo.dao;

import edu.uestc.ssmdemo.entity.Producerinfo;
import edu.uestc.ssmdemo.entity.ProducerinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducerinfoMapper {
    long countByExample(ProducerinfoExample example);

    int deleteByExample(ProducerinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Producerinfo record);

    int insertSelective(Producerinfo record);

    List<Producerinfo> selectByExample(ProducerinfoExample example);

    Producerinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Producerinfo record, @Param("example") ProducerinfoExample example);

    int updateByExample(@Param("record") Producerinfo record, @Param("example") ProducerinfoExample example);

    int updateByPrimaryKeySelective(Producerinfo record);

    int updateByPrimaryKey(Producerinfo record);
}