package edu.uestc.ssmdemo.Model;

import java.io.Serializable;

/**
 * Created by hu on 2018-04-23.
 */
public class Process implements Serializable{

    /**
     * 生产状态名称
     * 理布：LIBU
     * 柸定：PEIDING
     * 染色：RANSE
     * 水洗：SHUIXI
     * 漂白：PIAOBAI
     * 脫水：TUOSHUI
     * 剖布：PAOBU
     * 定型：DINGXING
     * 打卷：DAJUAN
     * 入库：RUKU
     */
    String process;
    /**
     * 生产流程状态
     */
    String processState;

    public void setProcess(String process) {
        this.process = process;
    }

    public void setProcessState(String processState) {
        this.processState = processState;
    }

    public String getProcess() {
        return process;
    }

    public String getProcessState() {
        return processState;
    }
}
