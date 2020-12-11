import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LOG_IN {
    static List<USER> users = new ArrayList<USER>();
    FileReader fr;
    public void login() throws IOException {
        FileReader fr = new FileReader("D:\\java\\图书管理系统（第三版）\\src\\USER");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            String[] s = str.split(",");
            users.add(new USER(s[0], s[1], Integer.parseInt(s[2]), s[3], s[4], s[5], Integer.parseInt(s[6])));
        }
        br.close();
    }

    BufferedReader br = new BufferedReader(fr);
    String str;

    public List<USER> getUSERs() {
        return users;
    }

    public void shows() throws IOException {
        FileReader fr = new FileReader("D:\\java\\图书管理系统（第三版）\\src\\USER");
        BufferedReader br = new BufferedReader(fr);
        String s;
        USER user = new USER();
        while ((s = br.readLine()) != null) {
            String sub = s.substring(s.indexOf(""));
            user.setId((sub));
            System.out.println(user.getId());
        }
        br.close();
    }
    public static void ShowUserInform(USER user){
        System.out.println(user.getId());
        System.out.println(user.getPassword());
        System.out.println(user.getType());
        System.out.println(user.getName());
        System.out.println(user.getUnit());
        System.out.println(user.getTelephone());
        System.out.println(user.getCount());
    }
    public static void input() throws IOException{
        FileWriter fw = new FileWriter("D:\\java\\图书管理系统（第三版）\\src\\USER");

        System.out.println("请输入要录入的信息：");

        Scanner str = new Scanner(System.in);
        String str1 = str.next();
        fw.write(str1);
        fw.close();
        System.out.println("已将信息写入文件中。");
    }
    public static void update(USER user){

    }
    public static void delete(USER user){

    }
    static int j = 0;
    public static void query() throws IOException { //输入名字查询信息
        int i = 0, k = 0, count = 0;
        Scanner in = new Scanner(System.in);
        while (i < users.size()) { //进不了循环
            System.out.println("请输入id：");
            String s = in.next();
            while(!s.equals(users.get(j).getName())){
                j ++;
            }
            if(s.equals(users.get(j).getName())){
                k = 1;
                System.out.println("输入正确");
                break;
            }
            else {
                System.out.println("查无此人！");
                j ++;
            }
        }
    }

    private static void show() throws IOException {
        FileReader fr = new FileReader("D:\\java\\图书管理系统（第三版）\\src\\USER");
        BufferedReader br = new BufferedReader(fr);
        String s;
        USER user = new USER();
        while ((s = br.readLine()) != null) {
            String sub = s.substring(s.indexOf(""));
            user.setId((sub));
            System.out.println(user.getId());
        }
        br.close();
    }

    public static void changePassword(USER user){

    }
    public static void LOGIN1() throws IOException {
        System.out.println("*******************");
        System.out.println("1.用户信息录入");
        System.out.println("2.用户信息修改");
        System.out.println("3.用户信息删除");
        System.out.println("4.用户信息查询");
        System.out.println("5.用户密码修改");
        System.out.println("0.返回主菜单");
        System.out.println("*******************");

        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextByte();
            switch (num1) {
                case 0:
                    return;
                case 1:
                    input();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("请选择要输入的方式：");
                    System.out.println("------------------------------");
                    System.out.println("1.输入姓名查询；");
                    System.out.println("2.显示所有人员信息；");
                    System.out.println("0.退出");
                    System.out.println("------------------------------");
                    Scanner i = new Scanner(System.in);
                    int x = i.nextInt();
                        switch (x) {
                            case 0:
                                break;
                            case 1:
                                query();
                                break;
                            case 2:
                                show();
                                break;
                            default:
                                System.out.println("输入错误！");
                        }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("非法输入！");
            }


    }

    public static void LOGIN2() {
        System.out.println("*******************");
        System.out.println("1.用户密码修改");
        System.out.println("0.返回主菜单");
        System.out.println("*******************");

        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextByte();
        switch (num2) {
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("非法输入！");
        }
    }
    public static void LOGIN3(){
        System.out.println("*******************");
        System.out.println("1.用户密码修改");
        System.out.println("0.返回主菜单");
        System.out.println("*******************");

        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextByte();
        switch (num2) {
            case 0:
                return;
            case 1:
                break;
            default:
                System.out.println("非法输入！");
        }
    }
}


