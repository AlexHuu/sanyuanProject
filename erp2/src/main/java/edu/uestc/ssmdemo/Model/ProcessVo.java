package edu.uestc.ssmdemo.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by hu on 2018-04-24.
 */
public class ProcessVo implements Serializable {
    ArrayList<Process> processeList = new ArrayList<Process>();

    public void setProcesseList(ArrayList<Process> processeList) {
        this.processeList = processeList;
    }

    public ArrayList<Process> getProcesseList() {
        return processeList;
    }
}
