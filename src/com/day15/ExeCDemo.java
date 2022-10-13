package com.day15;

import java.io.*;
import java.util.*;

/**
 * @program: JAVA
 * 描述：
 *          新建一个类：注册 登陆，序列化。保存好
 *   结合资费说明，加类。
 *  比如用户类中含资费 引用变量，
 * 如果你选了其中的一个套餐，
 *  比如 得到 短信条数：50条/月
 *  写个方法，用输出代替，你用掉了51条，还超过了一条，输出另外的费用。
 * 所有的属性，不能只在user中完成，要结合资费类，并要用到序列化.
 * @author: fzn
 * @create: 2020-08-06 18:41
 **/
public class ExeCDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------欢迎来到SoSo5G--------");
        while (true){
            System.out.println("请输入你要执行的操作 1 注册 2 登录 3 使用SoSo 4退出：");
            int nextInt = sc.nextInt();
            switch (nextInt){
                case 1:
                    reg();//注册
                    break;
                case 2:
                    //登录
                    login();
                    break;
                case 3:
                    System.out.println("使用SoSo");
                    use();
                    break;
                case 4:
                    System.out.println("正在退出");
                    System.exit(0);
                default:
                    System.out.println("请按照上面的格式输入");
            }
        }

    }
    //使用SoSo
    public static void use() {

    }

    static List<UserA> list = new ArrayList<>();
    //注册 使用对象流 把注册信息写入文件中
    public static void reg() throws IOException {
        //字节输出流
        FileOutputStream fi = new FileOutputStream("F:/reg.txt");
        //对象流
        ObjectOutputStream op = new ObjectOutputStream(fi);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id:");
        int id = sc.nextInt();
        System.out.println("请输入你要注册的用户名:");
        String name = sc.next();
        System.out.println("请输入密码:");
        String pass = sc.next();
        //显示手机号码 并选择 返回手机号码
        long phone = getPhone();
        System.out.println("请选择你的套餐 1话痨套餐 2网虫套餐 3超人套餐");
        //读文件开始
        File f = new File("E:\\思诚培训\\day30_0810\\zf.txt");
        Reader r = new InputStreamReader(new FileInputStream(f));
        char[] ch = new char[1024];
        int read = r.read(ch);
        r.close();
        String str = new String(ch,0,read);
        System.out.println(str);
        //读文件结束
        //套餐
        CompA c = null;
        //用户输入
        int num = sc.nextInt();
        switch (num){
            case 1:
                c = new A();//话痨套餐
                c.id=1;
                break;
            case 2:
                c = new B();//网虫套餐
                c.id=2;
                c.type="网虫套餐";
                break;
            case 3:
                c = new B();//超人套餐
                c.id=3;
                c.type="超人套餐";
                break;
            default:
                System.out.println("请正确输入");
        }
        System.out.println("请输入你要充值的金额：");
        int pr = sc.nextInt();
        //余额计算
        int pri = pr;
        UserA a = new UserA(id,name,pass,phone,pri);
        a.c = c;
        System.out.println(a);
        //list
        list.add(a);
        //写入
        op.writeObject(list);
        op.close();
        System.out.println("注册成功");
        System.out.println("请记住你的信息：id:"+id+" 用户名："+name+" 密码："+pass+" 手机号码："+phone+" 余额为："+pri+" 套餐是："+a.c.type);
    }
    //随机生成手机号码
    public static long getPhone(){
        //放入map中
        Map<Integer,Long> m = new HashMap<>();
        //随机生成电话号码
        Random rd = new Random();
        for (int i = 1; i <= 6; i++) {
            long phone = rd.nextInt(100000000) + 17900000000L;
            m.put(i,phone);
        }
        System.out.println("请选择手机号码：");
        System.out.println(m);
        Scanner sc = new Scanner(System.in);
        int phone = sc.nextInt();
        for (Integer integer : m.keySet()) {
            if (phone==integer){
                return m.get(integer);
            }
        }
        if (!m.keySet().contains(phone)){
            System.out.println("请按照规定输入");
            getPhone();
        }
        return 0;
    }
    //计算余额
    public static void balance(int pr){
        //传进入来的值减去套餐的资费

    }
    //登录 对象流登录
    public static void login() throws IOException, ClassNotFoundException {
        //字节输入流
        FileInputStream fi = new FileInputStream("F:/reg.txt");
        //对象字节输入流
        ObjectInputStream oi = new ObjectInputStream(fi);
        //输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name =sc.next();
        System.out.println("请输入密码：");
        String pass = sc.next();
        System.out.println("请输入手机号码");
        long phone = sc.nextLong();
        List<UserA> li = (List<UserA>) oi.readObject();
        boolean flag = true;
        for (UserA ua : li) {
            if (ua.name.equals(name) && ua.pass.equals(pass) && ua.phone==phone){
                flag =false;
                System.out.println("登录成功");
            }
        }
        if (flag){
            System.out.println("登录失败，请重新登录");
            login();
        }

    }
}
//实现Serializable接口
class UserA implements Serializable {
    static final long serialVersionUID = -112121242454L;
    int id;
    String name;
    String pass;
    long phone;//手机号
    int pri;//金额
    CompA c;//套餐

    public UserA(int id, String name, String pass, long phone,int pri) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.phone = phone;
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "UserA{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", phone=" + phone +
                ", pri=" + pri +
                ", c=" + c +
                '}';
    }
    //打电话
    public static void call(){
       Scanner sc =new Scanner(System.in);
        System.out.println("请输入你要执行的操作 1");
       sc.next();
    }
}
//套餐
class CompA implements Serializable{
    static final long serialVersionUID = -113121243554L;
    int id;//编号
    String type;//类型
    @Override
    public String toString() {
        return "CompA{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
//话痨套餐
class A extends CompA{
    int pri = 58;
}
//网虫套餐
class B extends CompA{
    int pri = 68;
}
//超人套餐
class C extends CompA{
    int pri = 78;
}