package edu.uestc.ssmdemo.entity;

import edu.uestc.ssmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

public class Userinfo {
    private Long userId;

    private String userPhoneno;

    private String userName;

    private String userPassword;
    /**
     * 判断用户是否有指定名称的权限
     */
    public boolean hasPrivilege(){
        //超级管理员有所有的权限
        if(isAdmin()){
            return true;
        }
        return false;
    }

    /**
     * 判断本用户是否是超级管理员
     */
    public boolean isAdmin(){

        for(Userinfo user:AdminList.getListadmin()){
            if(user.getUserName().equals(userName)){
                return true;
            }
        }
        return false;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPhoneno() {
        return userPhoneno;
    }

    public void setUserPhoneno(String userPhoneno) {
        this.userPhoneno = userPhoneno == null ? null : userPhoneno.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}