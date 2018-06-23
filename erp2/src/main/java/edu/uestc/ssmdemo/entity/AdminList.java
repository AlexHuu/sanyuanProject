package edu.uestc.ssmdemo.entity;

import java.util.List;

public class AdminList {

    private static List<Userinfo> listadmin;
    public static List<Userinfo> getListadmin() {
        return listadmin;
    }
    public static void  setListadmin(List<Userinfo> listadminin) {
        listadmin = listadminin;
    }
}
