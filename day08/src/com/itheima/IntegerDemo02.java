package com.itheima;
//转谁就调用谁的方法
public class IntegerDemo02 {
    public static void main(String[] args) {
        //int->String
        //方法1
        int number = 100;
        String s1 = number+"";
        System.out.println(s1);
        //方法2
        //static String value0f(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("------------");

        //String->int
        String s = "100";
        //方法1:String->Integer->int
        Integer i = Integer.valueOf(s);
        System.out.println(i+1);
        //int intvalue() 返回此值Integer为int
        int x = i.intValue();
        System.out.println(x+1);
        //方法2
        //static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y+1);
        String s4 = "123";
        System.out.println(s4.length());//空字符不能转int
        int s5 = Integer.parseInt(s4);
        System.out.println(s5);
        String s6 = String.valueOf(s5);
        System.out.println(s6.length());
        System.out.println(s6);
    }
}
