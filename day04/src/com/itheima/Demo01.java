package com.itheima;

/*案例: for循环案例1(输出数据)
        打印整数1到5
        打印整数5到1

        ++,--: 自增自减运算符,只能用于变量不能用于常量
        ++作用: 让变量自己+1
        --作用: 让变量自己-1

        如果符号在前: 先让变量+1或者-1的操作,再参与操作
        如果符号在前: 先让参与操作,然后做变量+1或者-1的操作
* */
public class Demo01 {
    public static void main(String[] args) {
//        打印整数1到5
        for(int i = 1; i <= 5; i ++){
            System.out.println(i);
        }

        System.out.println("-----------");

//         打印整数5到1
        for(int i = 5; i >= 1; i --){
            System.out.println(i);

//            int a = 10;
//            int b = ++a;//int b = 11
//            System.out.println(b);//11
//            int a = 10;
//            int b = a++;//int b = 10
//            System.out.println(b);//10
//            System.out.println(a);//11
        }
    }
}
