package com.itheima;
/*
*   数组使用的两个小问题:
*               1索隐问题:访问了数组中不存在的索引对应的元素,造成索引越界问题
*                   ArrayIndexOutOfBoundsException
*               2空指针异常:对象不再指向堆内存,还想继续访问数据,访问失败
*                   NullPointerException
*
*               null:空值,引用数据类型的默认值,表示不指向任何对象
* */
public class ArrayTest02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //输出元素
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 3 out of bounds for length 3
//        System.out.println(arr[3]);
        System.out.println(arr[2]);//修改为正确索引范围

        //把null赋值给arr
        arr = null;
        //输出元素
        //Exception in thread "main" java.lang.NullPointerException:
        // Cannot load from int array because "arr" is null
//        System.out.println(arr[0]);
        if(arr != null){//加上判断,输出
            System.out.println(arr[0]);
        };
    }
}
