package edu.uestc.ssmdemo.Convert;

import java.io.UnsupportedEncodingException;

public class ProcessConvert {


    public static String covert(String process) throws UnsupportedEncodingException {
        String[] steps = process.split(",");
        StringBuffer sb = new StringBuffer();

        for (String s:steps
             ) {
            if (s.equals("0")) {sb.append("理布1"); sb.append("->");}
            else if (s.equals("1")) {sb.append("坯定"); sb.append("->");}
            else if (s.equals("2")) {sb.append("染色"); sb.append("->");}
            else if (s.equals("3")) {sb.append("水洗"); sb.append("->");}
            else if (s.equals("4")) {sb.append("漂白"); sb.append("->");}
            else if (s.equals("5")) {sb.append("脱水"); sb.append("->");}
            else if (s.equals("6")) {sb.append("剖布"); sb.append("->");}
            else if (s.equals("7")) {sb.append("理布2"); sb.append("->");}
            else if (s.equals("8")) {sb.append("定型"); sb.append("->");}
            else if (s.equals("9")) {sb.append("打卷"); sb.append("->");}
            else if (s.equals("10")) {sb.append("入库"); sb.append("->");}
        }
        String re = sb.substring(0,sb.length() - 2);

        return new String(re.getBytes("GBK"),"utf-8");
    }
}
