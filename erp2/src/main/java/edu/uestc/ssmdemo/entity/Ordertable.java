package edu.uestc.ssmdemo.entity;

import java.util.Date;

public class Ordertable {
    private String orderno;

    private String customer;

    private Date date;

    private Double countofcloth;

    private String weight;

    private Double uncompleted;

    private String remarkoftype;

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getCountofcloth() {
        return countofcloth;
    }

    public void setCountofcloth(Double countofcloth) {
        this.countofcloth = countofcloth;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public Double getUncompleted() {
        return uncompleted;
    }

    public void setUncompleted(Double uncompleted) {
        this.uncompleted = uncompleted;
    }

    public String getRemarkoftype() {
        return remarkoftype;
    }

    public void setRemarkoftype(String remarkoftype) {
        this.remarkoftype = remarkoftype == null ? null : remarkoftype.trim();
    }
}