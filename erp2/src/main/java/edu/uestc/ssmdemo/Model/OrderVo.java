package edu.uestc.ssmdemo.Model;

import java.sql.Date;

/**
 * Created by hu on 2018-04-23.
 */
public class OrderVo {
    String customerName;
    Date startDate;
    Date endDate;

    public String getCustomerName() {
        return customerName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
