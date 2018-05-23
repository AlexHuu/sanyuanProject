package edu.uestc.ssmdemo.Convert;

import edu.uestc.ssmdemo.Model.OrderTableVo;
import edu.uestc.ssmdemo.Model.Process;
import edu.uestc.ssmdemo.Model.ProcessVo;
import edu.uestc.ssmdemo.Model.TasktableVo;
import edu.uestc.ssmdemo.Tool.SerializeObjectTool;
import edu.uestc.ssmdemo.entity.Ordertable;
import edu.uestc.ssmdemo.entity.Tasktable;
import org.apache.log4j.Logger;
import org.junit.Assert;

import java.io.IOException;

/**
 * Created by hu on 2018-04-24.
 */
public class ConvertUtil {

    private static Logger logger = Logger.getLogger(ConvertUtil.class);

    public static Tasktable TasktableVo2Tasktable(TasktableVo tasktableVo) throws IOException {

        Tasktable tasktable = new Tasktable();
        BeanRefUtil.TasktableVo2Tasktable(tasktableVo,tasktable);
        String[] process = tasktableVo.getProcess();
        StringBuffer sb = new StringBuffer();
        for (String s:process
             ) {
            sb.append(s);
            sb.append(",");
        }
        tasktable.setProcess(sb.substring(0,sb.length() - 1).toString());

//        ProcessVo processVo = new ProcessVo();
//        for (String p : tasktableVo.getProcess()) {
//            Process process = new Process();
//            process.setProcess(p);
//            processVo.getProcesseList().add(process);
//        }
//        byte[] processBytes = SerializeObjectTool.SerializeObject(processVo);
//        tasktable.setProcess(processBytes);
        return  tasktable;
    }

    public static Ordertable OrderTableVo2Ordertable(OrderTableVo orderTableVo) {

        Ordertable ordertable = new Ordertable();
        String customer = orderTableVo.getCustomer();
        String weight = orderTableVo.getWeight();
        String remarkoftype = orderTableVo.getRemarkoftype();
        String countofcloth = orderTableVo.getCountofcloth();

        Assert.assertTrue("countofclothΪ��",countofcloth !=null && !"".equals(countofcloth));
        Assert.assertTrue("customerΪ��",customer !=null && !"".equals(customer));
        Assert.assertTrue("weightΪ��",weight !=null && !"".equals(weight));
        Assert.assertTrue("remarkoftypeΪ��",remarkoftype !=null && !"".equals(remarkoftype));

        ordertable.setCustomer(customer);
        ordertable.setWeight(weight);
        ordertable.setRemarkoftype(remarkoftype);
        ordertable.setCountofcloth(Double.valueOf(countofcloth));
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = simpleDateFormat.parse(dateVo);
//        } catch (ParseException e) {
//            logger.error("OrderTableVo2Ordertable ����ת���쳣");
//        }
//        ordertable.setDate(date);

        return ordertable;
    }
}
