package com.itheima;

/*
 *       相机测试类
 * */
public class CameraTest {
    public static void main(String[] args) {
        //空参
        Camera c1 = new Camera();
        c1.setBrand("佳能");
        c1.setType("EOS 4000D");
        c1.setScene("+18-55mm III镜头");
        c1.setPlace("日本");
        c1.setPrice(2349.0);
        c1.setColor("黑色");
        c1.setAppraise(5500);
        c1.show();
        System.out.println("-------------");
        //带参
        Camera c2 = new Camera(
                "尼康",
                "单反",
                "+18-55mm III镜头",
                "日本",
                2666,
                "白色",
                10000
        );
        c2.show();
    }
}
