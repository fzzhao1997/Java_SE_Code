import java.util.*;

public class TwentyOne {
    public static void main(String[] args) {
        Random r = new Random();
        String[] color = {"♠", "♣", "◆", "♥"};
        String[] num = {"A", "2", "4", "3", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//缺少元素,回填不满13,报错
        String[][] poker = new String[4][13];
        String[] playerHand = new String[5];
        String[] PCHand = new String[5];
        int playerNum,PCNum;
        System.out.println();
        Book book = new Book();//创建字典新对象
        //创建poker
        for (int i = 0; i < poker.length; i++) {
            for (int j = 0; j < poker[i].length; j++) {
                poker[i][j] = color[i] + num[j];
//                System.out.print(poker[i][j]);
            }
//            System.out.println();
        }
        //洗牌:随机交换思想
        for (int i = 0; i < poker.length; i++) {
            for (int j = 0; j < poker[i].length; j++) {
                String temp;
                temp = poker[i][j];
                int x = r.nextInt(poker.length);
                int y = r.nextInt(poker[i].length);
                poker[i][j] = poker[x][y];
                poker[x][y] = temp;
            }
        }
//        //遍历poker
//        for (int i = 0; i < poker.length; i++) {
//            for (int j = 0; j < poker[i].length; j++) {
//                System.out.print(poker[i][j]);
//            }
//            System.out.println();
//        }
        //发牌
        int pokerCount = 0;
        int playerHandCount = 0;
        int PCHandCount = 0;
        while (true) {
            if (pokerCount < poker[0].length) {
                playerHand[playerHandCount] = poker[0][pokerCount];
                pokerCount++;
                playerHandCount++;
                PCHand[PCHandCount] = poker[0][pokerCount];
                pokerCount++;
                PCHandCount++;
            }
            if (pokerCount == 4) {
                break;
            }
        }
        //计算初始点数
        List<String> allSplitStrings = new ArrayList<>();// 用于存储拆分后的字符串
        for(String str:playerHand){// 遍历字符串数组，拆分每个字符串
            // 拆分字符串，并添加到列表中
            String[] splitStrings = str.split("   ");
            Collections.addAll(allSplitStrings, splitStrings);
        }
        String[] result = allSplitStrings.toArray(new String[0]);
        //解析String转为int,并相加
        playerNum = Integer.parseInt(result[1])+Integer.parseInt(result[3]);
        System.out.println(playerNum);


//        //玩家和PC手牌显示
//        System.out.println(playerHand[0] + "   " + playerHand[1]);
//        System.out.println(PCHand[0] + "   " + PCHand[1]);
        //是否加牌
        Scanner sc = new Scanner(System.in);
        System.out.println("是否摸牌,摸牌按0,不摸按1");
        int raise = sc.nextInt();
    }
}


