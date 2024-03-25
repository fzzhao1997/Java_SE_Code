/*需求:
   12,1,2冬季
   3,4,5春季
   6,7,8夏季
   9,10,11秋季*/
package com.itheima.com.itheima;

import java.util.Scanner;

public class Demo23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//创建录入对象
        System.out.println("请输入月份:");//输入提示
        int month = sc.nextInt();//调用方法,接受数据

//if实现
//        while (true) {
//            System.out.println("请输入月份:");//输入提示
//
//            int month = sc.nextInt();//调用方法,接受数据
//            if (month == 12 || month == 1 || month == 2) {
//                System.out.println("冬季");
//            } else if (month == 3 || month == 4 || month == 5) {
//                System.out.println("春季");
//            } else if (month == 6 || month == 7 || month == 8) {
//                System.out.println("夏季");
//            } else if (month == 9 || month == 10 || month == 11) {
//                System.out.println("秋季");
//            }else{
//                System.out.println("输入错误");
//            }
//        }

//        switch实现
        //case的穿透
        //当case中省略break不写,就会开启穿透
        //后续case就不具备匹配效果,执行遇到的所有语句体(先匹配后穿)
        //直到遇到下一个break,或者switch执行完毕停止
//        switch (month) {
//            case 12:
//                System.out.println("冬季");
//                break;//结束整个switch语句
//            case 1:
//                System.out.println("冬季");
//                break;
//            case 2:
//                System.out.println("冬季");
//                break;
//            case 3:
//                System.out.println("春季");
//                break;//结束整个switch语句
//            case 4:
//                System.out.println("春季");
//                break;
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//                System.out.println("夏季");
//                break;//结束整个switch语句
//            case 7:
//                System.out.println("夏季");
//                break;
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//                System.out.println("秋季");//如果输入10,9不匹配
//
//            case 10:
//                System.out.println("秋季");//匹配成功
//
//            case 11:
//                System.out.println("秋季");//穿
//
//            default://类似else备胎的作用
//                System.out.println("你输入的月份有误");//穿
//
//        }

//        //穿透优化(重复代码优化,或者类型)
//        switch (month) {
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("冬季");
//                break;
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("春季");
//                break;
//
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("夏季");
//                break;
//
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("秋季");
//                break;
//
//            default://类似else备胎的作用
//                System.out.println("你输入的月份有误");
//                break;
//        }

        //穿透再次优化(重复代码优化,或者类型)
        switch (month) {
            case 12,1,2:
                System.out.println("冬季");
                break;

            case 3,4,5:
                System.out.println("春季");
                break;

            case 6,7,8:
                System.out.println("夏季");
                break;

            case 9,10,11:
                System.out.println("秋季");
                break;

            default://类似else备胎的作用
                System.out.println("你输入的月份有误");
                break;
        }
    }
}
