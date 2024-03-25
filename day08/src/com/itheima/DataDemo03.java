package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo03 {
    public static void main(String[] args) throws ParseException {
        /*
        *   格式化Data->String
        * */
        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化系统时间
        System.out.println(sdf.format(new Date()));
        /*
        *   默认格式:2022/10/25 下午5:01
        *   指定格式1:2022年10月25日 17:02:13
        *   指定格式2:2022-10-25 17:02:40
        * */

        /*
        *   解析String->Data
        * */
        //创建格式化对象
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        //解析字符串
        Date data = sdf1.parse("2022/10/25 下午5:01");
        System.out.println(data);
    }
}
