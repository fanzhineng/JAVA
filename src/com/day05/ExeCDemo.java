package com.day05;

/**
 * @program: JAVA
 * 描述：
 *      3.3 新建文件，设计一个类中，含内部类. 能输出数据。
 * @author: fzn
 * @create: 2020-07-27 19:21
 **/
public class ExeCDemo {
    public static void main(String[] args) {
        Student s = new Student(101,"张珊",5);
        s.fun();
    }
}
//学生
class Student{
    int id;//编号
    String name;//姓名
    int cl;//班级
    //有参构造器
    public Student(int id, String name, int cl){
        this.id = id;
        this.name = name;
        this.cl = cl;
    }
    //内部类 xx的成绩
    class Grades{
        int sc = 500;

        //一般方法
        public void getG(){
            System.out.println("编号"+id+" 姓名："+name+" 班级："+cl+"班 分数："+sc);
        }
    }
    //输出学生的成绩信息
    public void fun(){
        Grades grades = new Grades();
        grades.getG();
    }

}