package com.fzn2020.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-27 16:10
 **/
public class CallDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        pro("胡建","bb","cc");
    }
    public static void pro(String namea,String pw,String em) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取数据库连接对象
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        //连接上后 调用存储过程
        //参数为一个字符串 字符串的内容是sql语句
        //?是占位符 表示此处等下会放入变量
        //CallableStatement cs = con.prepareCall("{call pro_6(seq_u3.nextval,?,?,?)}");
        CallableStatement cs = con.prepareCall("{call pro_6(seq_u3.nextval,'"+namea+"','"+pw+"','"+em+"')}");
        //按？的序号赋值
//        cs.setString(1,namea);
//        cs.setString(2,pw);
//        cs.setString(3,em);
        //整个调用存储过程要交给预处理平台 准备执行事宜的平台
        cs.execute();//预处理平台处理
        con.commit();//事务提交

    }
}
