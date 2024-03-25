package game1;

public class AppTest {
    public static void main(String[] args) {
        PictureJFrame pf = new PictureJFrame();
        int [][] array = pf.PictureJFrame();//返回值调用的逐个传递
        //调用arr方法并将返回值存储在变量array中
//                                            //个有返回值不一定一定要用变量来接受的
//        //如果你要用到这个方法的返回值对这个返回值操作的话才接受
//        //遍历array
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
