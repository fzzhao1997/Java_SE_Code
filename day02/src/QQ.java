//判断black账号是否正确
public class QQ {
    public static void main(String[] args) {
        String black = "wu";//定义一个black变量,并设定一个无关初始值,避免报错
        int account = 1017542093;//输入账号
        String password = "970303ZFz";//输入密码
        if (account == 1017542093&&password == "970303ZFz"){//判断是否为black的账号密码
            black = "账号和密码正确";//正确情况black的输出值
        }else{
            black = "账号和密码错误";//错误情况black的输出值
        }
        if(black == "账号和密码正确") {//判断black的输出值是否满要求
            System.out.println("展示好友列表界面");//black的输出值满足要求,打印
        }else{
            System.out.println("提示账号或密码有问题");//black的输出值不满足要求,打印
        }
    }
}
