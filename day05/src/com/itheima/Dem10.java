package com.itheima;
   // 重载:
        //同一个类中方法名相同,参数列表不同
        //方法名相同
        //  参数列表不同(数量,类型,顺序)

        //方法重载的好处:
                //让调用者不用记忆太多的方法名
                //调用方法时,JVM会根据参数列表,匹配对应的方法/
        //学习目的?能识别代码中的重载

        //println:打印并换行
        //print:一行打印
public class Dem10 {
    public static void main(String[] args) {
        getSum(5,10);
        getSum(10,20,30);
        System.out.print(10);
        System.out.print(3.14);
        System.out.println('A');
        System.out.println("黑马程序员");
        System.out.println(false);
    }
    public static double getSum(double a,int b){
        return a + b;
    }
       public static double getSum(int a,double b){
           return a + b;
       }
    public static int getSum(int a,int b){
        return a + b;
    }
    public static int getSum(int a,int b,int c){
        return a + b +c;
    }
}
