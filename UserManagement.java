import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserManagement {
    List<USER> users = new ArrayList<USER>();

    public UserManagement() throws IOException {
        FileReader fr = new FileReader("D:\\java\\图书管理系统（第三版）\\src\\USER");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            String[] s = str.split(",");
            users.add(new USER(s[0], s[1], Integer.parseInt(s[2]), s[3], s[4], s[5], Integer.parseInt(s[6])));
        }
        br.close();
    }

    public List<USER> getUSERs() {
        return users;
    }

    public void show() throws IOException {
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

    int j = 0;

    public USER login() throws IOException {
        int i = 0, k = 0, count = 0;
        Scanner in = new Scanner(System.in);
        while (i < users.size()) {
            System.out.println("请输入id：");
            String s = in.next();
            while(!s.equals(users.get(j).getId())){
                j ++;
            }
            if(s.equals(users.get(j).getId())){
                k = 1;
                System.out.println("输入正确");
                break;
            }
            else {
                System.out.println("查无此人！");
                j++;
            }
        }
        if (k == 1) {
            int n = 3;
            for (i = 1; i < 4; i++) {
                System.out.println("请输入密码：");
                String p = in.next();
                if (p.contentEquals(users.get(j).getPassword())) {
                    //password  = users.get(j).getPassword();
                    System.out.println("登录成功！");
                    break;
                } else {
                    System.out.println("密码输入错误！");
                    count++;
                    n--;
                    if (n != 0)
                        System.out.println("还剩" + n + "机会");
                }
                if (count == 3) {
                    System.out.println("密码错误！已退出");
                    System.exit(0);
                }
            }
        }

        //if(s.equals(users.get(j).getId())&&p.equals(users.get(j).getPassword())){
        //	}
        return users.get(j);
    }
}
