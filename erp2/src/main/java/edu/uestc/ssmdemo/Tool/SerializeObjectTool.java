package edu.uestc.ssmdemo.Tool;

import java.io.*;

/**
 * Created by hu on 2018-04-23.
 */
public class SerializeObjectTool {
    /**
     * 对象序列化为字符串
     * @param obj
     * @return
     */
    public static byte[] SerializeObject(Object obj) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(os);
        out.writeObject(obj);
        byte[] bytes = os.toByteArray();
        return bytes;
    }

       /**
      * 字符串序列化为对象
      * @param objectByte
      * @return
      * @throws Exception
      */
    public static Object ReSerializeObject(byte[] objectByte)throws Exception{
        ByteArrayInputStream is = new ByteArrayInputStream(objectByte);
        ObjectInputStream in = new ObjectInputStream(is);
        return in.readObject();
    }
}
