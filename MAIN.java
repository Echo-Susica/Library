public class MAIN {
    public static void main(String[] args) {
        //  USER user1 = new USER("1998017", "123", 1, "丁一", "网络中心", "13945092233", 10);
        System.out.println("欢迎来到图书管理信息系统~");
        System.out.println("请先登录~");
        try{
            UserManagement users = new UserManagement();
            //System.out.println(	users.getUSERs());
            USER user1;
            user1 = users.login();
            //	System.out.println(	users.getLogin().getType());
            //	users.show();
            if(user1.getType() == 1){
                System.out.print("欢迎！");
                System.out.print("系统管理员");
                System.out.print(user1.getName());
                System.out.println();
                MENU.ME_NU1();
            }
            else if(user1.getType() == 2){
                System.out.print("欢迎！");
                System.out.print("图书管理员");
                System.out.print(user1.getName());
                System.out.println();
                MENU.ME_NU2();
            }
            else if(user1.getType() == 3){
                System.out.print("欢迎！");
                System.out.print("读者");
                System.out.print(user1.getName());
                System.out.println();
                MENU.ME_NU3();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }


    }
}
