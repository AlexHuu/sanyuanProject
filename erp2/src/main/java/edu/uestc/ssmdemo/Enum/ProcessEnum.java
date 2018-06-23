package edu.uestc.ssmdemo.Enum;

import java.io.UnsupportedEncodingException;

/**
 * Created by hu on 2018-04-23.
 */
public enum ProcessEnum {

    NOTWORK("还未工作","-1"),
    LIBU1("理布1","0")  ,
    PEIDING("坯定","1") ,
    RANSE("染色","2")   ,
    SHUIXI("水洗","3")  ,
    PIAOBAI("漂白","4") ,
    TUOSHUI("脱水","5") ,
    POBU("剖布","6")    ,
    LIBU2("理布2","7")  ,
    DINGXING("定型","8"),
    DAJUAN("打卷","9")  ,
    RUKU("入库","10")   ;
    private String name;
    private String index;
    ProcessEnum(String name, String index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(String index) throws UnsupportedEncodingException {
        for (ProcessEnum c : ProcessEnum.values()) {
            if (c.getIndex().equals(index) ) {
                return new String(c.name.getBytes("GBK"),"utf-8");
            }
        }
        return null;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getIndex() {
        return index;
    }
}
