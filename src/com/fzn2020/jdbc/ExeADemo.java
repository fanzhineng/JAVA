package com.fzn2020.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: JAVA
 * 描述：
 *      新建一个项目，新建一个表，创建一个存储过程，表 商品表(id name title pri)
 * 可通过java程序进行数据增加的.
 * @author: fzn
 * @create: 2020-08-27 17:43
 **/
public class ExeADemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        insert("苹果手机","苹果公司生产",5999);

    }
    //插入数据到数据库中
    public static void insert(String namea,String title,int pri) throws ClassNotFoundException, SQLException {
        //通过反射注册驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取数据库对象
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
        //调用存储过程
        CallableStatement cs = con.prepareCall("{call pro_9(seq_com.nextval,?,?,?)}");
        cs.setString(1,namea);
        cs.setString(2,title);
        cs.setInt(3,pri);
        cs.execute();//预处理平台处理
        con.commit();//事务提交
    }
}
