package com.itheima;

public class MethodDemo {
    //需求:定义一个方法,该方法接受一个参数,判断该数据是否是偶数,并返回值
    public static boolean isEvenNumber(int number){
        if (number %2 == 0){
            return true;//与boolean类型一致
        }else {
            return false;//与boolean类型一致
        }
    }

    public static void main(String[] args) {
        boolean flag = isEvenNumber(10);//接收return值
        System.out.println(flag);
        if(flag){
            System.out.println("是偶数");
        }
    }
}
