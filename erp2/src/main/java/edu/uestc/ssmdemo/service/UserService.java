package edu.uestc.ssmdemo.service;

import edu.uestc.ssmdemo.entity.Userinfo;

import java.util.List;

public interface UserService {

    Userinfo login(Userinfo user);

    String register(Userinfo user);

    List<Userinfo> getListAmind();

    List<Userinfo> findBynameOrPhone(Userinfo user);

    void deleteById(Long aLong);

    Userinfo getAdminById(Long id);

    void saveEdit(Userinfo user);

    String checkUserPhone(Userinfo user);
}
