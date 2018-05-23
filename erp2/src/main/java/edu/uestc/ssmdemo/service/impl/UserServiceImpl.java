package edu.uestc.ssmdemo.service.impl;

import edu.uestc.ssmdemo.dao.UserinfoMapper;
import edu.uestc.ssmdemo.entity.Userinfo;
import edu.uestc.ssmdemo.entity.UserinfoExample;
import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserinfoMapper userinfoMapper;

    public Userinfo login(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhonenoEqualTo(user.getUserPhoneno());
        criteria.andUserPasswordEqualTo(user.getUserPassword());
        List<Userinfo> sysUsers = userinfoMapper.selectByExample(example);
        if (sysUsers != null && sysUsers.size() >= 1){
            return sysUsers.get(0);
        }
        return null;
    }

    public String register(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        example.createCriteria().andUserPhonenoEqualTo(user.getUserPhoneno());
        List<Userinfo> users = userinfoMapper.selectByExample(example);
        if (users != null && users.size() > 0){
            return "no";
        }
        userinfoMapper.insert(user);
        return "yes";
    }

    public List<Userinfo> getListAmind() {
        return userinfoMapper.selectByExample(new UserinfoExample());
    }

    public List<Userinfo> findBynameOrPhone(Userinfo user) {
        System.out.println(user.getUserName() + "  " + user.getUserPhoneno());
        UserinfoExample example = new UserinfoExample();
        UserinfoExample.Criteria criteria = example.createCriteria();
        if (user.getUserName() != null && user.getUserName().length() > 0){
            criteria.andUserNameLike("%" + user.getUserName() + "%");
        }
        if (user.getUserPhoneno() != null && user.getUserPhoneno().length() == 11){
            criteria.andUserPhonenoEqualTo(user.getUserPhoneno());
        }
        List<Userinfo> users = userinfoMapper.selectByExample(example);
        System.out.println(users.size());
        return users;
    }

    public void deleteById(Long aLong) {
        userinfoMapper.deleteByPrimaryKey(aLong);
    }

    public Userinfo getAdminById(Long id) {
        return userinfoMapper.selectByPrimaryKey(id);
    }

    public void saveEdit(Userinfo user) {
        userinfoMapper.updateByPrimaryKey(user);
    }

    public String checkUserPhone(Userinfo user) {
        UserinfoExample example = new UserinfoExample();
        example.createCriteria().andUserPhonenoEqualTo(user.getUserPhoneno());
        List<Userinfo> users = userinfoMapper.selectByExample(example);
        for (Userinfo u:users
             ) {
            if (u.getUserId() != user.getUserId())
                return "no";
        }
        return "yes";
    }
}
