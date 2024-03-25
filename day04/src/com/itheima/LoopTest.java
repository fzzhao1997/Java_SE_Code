package com.itheima;
/*
for和while先判断再执行,
do...while先执行再判断(至少执行一次)

for循环的条件控制语句所控制的自增变量,在for循环结束后,就不可以继续使用了
while循环的条件控制语句所控制的自增变量,在while循环结束后,还可以继续使用了
 */
public class LoopTest {
    public static void main(String[] args) {
        //for循环
        for (int i = 3;i < 3;i ++){
            System.out.println("我爱java");
        }
        System.out.println("-----------");

        //while循环
        int j = 3;
        while(j <3){
            System.out.println("我爱java");
            j ++;
        }
        System.out.println("-----------");

        //do...while循环
        int k = 3;
        do{
            System.out.println("我爱java");
            k ++;
        }while(k <3);

        //死循环
//        for(;;){}

//        while(true){}

//        do{}while (true);
    }
}
