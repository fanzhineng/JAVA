package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-08-27 15:32
 **/
public class ConDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConDemo c = new ConDemo();
        System.out.println(c.getCon());;
    }
    //先要连接上数据库
    //Connection 数据库的连接
    public Connection getCon() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取数据库连接对象
        //Connection 管理驱动 针对已驱动的程序管理
        /*第一个参数，用来指定 数据库用的技术 哪种数据库，地址 端口指定数据库
         * 用户名 密码
         */
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        return con;
    }
}
