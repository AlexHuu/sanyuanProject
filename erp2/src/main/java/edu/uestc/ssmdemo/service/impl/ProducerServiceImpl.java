package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.dao.ProducerinfoMapper;
import edu.uestc.ssmdemo.entity.Producerinfo;
import edu.uestc.ssmdemo.entity.ProducerinfoExample;
import edu.uestc.ssmdemo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    ProducerinfoMapper producerinfoMapper;

    public Producerinfo login(Producerinfo producer) {
        ProducerinfoExample example = new ProducerinfoExample();
        ProducerinfoExample.Criteria criteria = example.createCriteria();
        criteria.andPhonenoEqualTo(producer.getPhoneno());
        criteria.andPasswordEqualTo(producer.getPassword());

        List<Producerinfo> producerinfos = producerinfoMapper.selectByExample(example);

        if (producerinfos != null && producerinfos.size() > 0){
            return producerinfos.get(0);
        }
        return null;
    }

    public String register(Producerinfo producer) {
        ProducerinfoExample example = new ProducerinfoExample();
        example.createCriteria().andPhonenoEqualTo(producer.getPhoneno());
        List<Producerinfo> producers = producerinfoMapper.selectByExample(example);
        if (producers != null && producers.size() > 0){
            return "no";
        }
        producerinfoMapper.insert(producer);
        return "yes";
    }

    public List<Producerinfo> getListPro() {
        return producerinfoMapper.selectByExample(new ProducerinfoExample());
    }

    public void deleteById(Long aLong) {
        producerinfoMapper.deleteByPrimaryKey(aLong);
    }

    public List<Producerinfo> findBynameOrPhone(Producerinfo producer) {
        ProducerinfoExample example = new ProducerinfoExample();
        ProducerinfoExample.Criteria criteria = example.createCriteria();
        if (producer.getName() != null && producer.getName().length() > 0){
            criteria.andNameLike("%" + producer.getName() + "%");
        }
        if (producer.getPhoneno() != null && producer.getPhoneno().length() == 11){
            criteria.andPhonenoEqualTo(producer.getPhoneno());
        }
        List<Producerinfo> producers = producerinfoMapper.selectByExample(example);
        System.out.println(producers.size());
        return producers;
    }
}
