package edu.uestc.ssmdemo.Model;

/**
 * Created by hu on 2018-04-23.
 */
public class OrderTableVo {
    private String orderno;

    private String customer;

    private String date;

    private String countofcloth;

    private String weight;

    private String uncompleted;

    private String remarkoftype;

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setCountofcloth(String countofcloth) {
        this.countofcloth = countofcloth;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setUncompleted(String uncompleted) {
        this.uncompleted = uncompleted;
    }

    public void setRemarkoftype(String remarkoftype) {
        this.remarkoftype = remarkoftype;
    }

    public String getOrderno() {
        return orderno;
    }

    public String getCustomer() {
        return customer;
    }



    public String getCountofcloth() {
        return countofcloth;
    }

    public String getWeight() {
        return weight;
    }

    public String getUncompleted() {
        return uncompleted;
    }

    public String getRemarkoftype() {
        return remarkoftype;
    }
}
