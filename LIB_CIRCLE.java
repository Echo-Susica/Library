import java.util.Scanner;

public class LIB_CIRCLE {
    public static void LIB_CIR(){
        System.out.println();
        System.out.println("**********************");
        System.out.println("1.借书处理");
        System.out.println("2.还书处理");
        System.out.println("3.借阅信息查询");
        System.out.println("0.返回主菜单");
        System.out.println("**********************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num){
            case 0:
                return;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("非法输入！");
        }

    }
}
