import java.util.Scanner;

public class LIBRARY {
    public static void LIB1(){
        System.out.println();
        System.out.println("***************");
        System.out.println("1.图书信息查询");
        System.out.println("0.返回主菜单");
        System.out.println("***************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int num = input.nextByte();
        switch (num){
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("非法输入！");
        }
    }
    public static void LIB2(){
        System.out.println();
        System.out.println("***************");
        System.out.println("1.图书信息录入");
        System.out.println("2.图书信息修改");
        System.out.println("3.图书信息删除");
        System.out.println("4.图书信息查询");
        System.out.println("0.返回主菜单");
        System.out.println("***************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int num = input.nextByte();
        switch (num){
            case 0:
                return;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case  4:
                break;
            default:
                System.out.println("非法输入！");
        }
    }
    public static void LIB3(){
        System.out.println();
        System.out.println("***************");
        System.out.println("1.图书信息查询");
        System.out.println("0.返回主菜单");
        System.out.println("***************");
        System.out.println();

        Scanner input = new Scanner(System.in);
        int num = input.nextByte();
        switch (num){
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("非法输入！");
        }
    }

}
