package com.fzn2020.java0703.day0831.io;



import java.io.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: JAVA
 * 描述：  学生管理类
 * @author: fzn
 * @create: 2020-08-31 10:49
 **/
public class StudentManager {
    //set集合
    private Set<Student> studentSet;
    Scanner sc = new Scanner(System.in);

    //添加的方法
    public void  add(){
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生的班级：");
        String clazz = sc.next();
        Student student = new Student(name,age,clazz);
        studentSet.add(student);
    }
    //修改学生信息
    public void update(){
        System.out.println("请输入你要修改的学生姓名：");
        String name = sc.next();
        System.out.println("请输入你要修改的学生的年龄：");
        int age = sc.nextInt();
        Student student = new Student(name,age);
        if (!studentSet.contains(student)){
            System.out.println("该学生信息不存在");
            return;
        }
        System.out.println("请输入你要修改的学生的班级：");
        String clazz = sc.next();
        student.setClazz(clazz);
        studentSet.remove(student);
        studentSet.add(student);
    }
    //删除
    public void delete(){
        System.out.println("请输入你要删除的学生姓名：");
        String name = sc.next();
        System.out.println("请输入你要删除的学生的年龄：");
        int age = sc.nextInt();
        Student student = new Student(name,age);
        if (!studentSet.contains(student)){
            System.out.println("该学生信息不存在");
            return;
        }
        studentSet.remove(student);
        System.out.println("删除成功");

    }
    //显示所有
    public void show(){
        if (studentSet.size()<=0){
            System.out.println("暂时没有学生！");
            return;
        }
        System.out.println("姓名\t年龄\t班级");
        for (Student student : studentSet) {
            System.out.println(student.getName()+"\t"+student.getAge()+"\t"+student.getClazz());
        }
    }
    //通过名字查询
    public void findByName(){
        System.out.println("请输入学生的姓名：");


        String name = sc.next();
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            if (name.equals(next.getName())){
                System.out.println(next.getName()+"\t"+next.getAge()+"\t"+next.getClazz());
            }
        }
    }
    //序列化
    public void saveTOFile(){
        //try()括号里面会自动关闭流 定义在里面的资源会自动关闭
        try (
            FileOutputStream fos = new FileOutputStream("f:/student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ){
            oos.writeObject(studentSet);//将对象序列号到文件中
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //反序列化
    public void readFromFile(){
        try(
                FileInputStream fis = new FileInputStream("f:/student");
                ObjectInputStream ois = new ObjectInputStream(fis);

                ) {
            Set<Student> studentSet = (Set<Student>) ois.readObject();
            if (studentSet!=null){
                this.studentSet=studentSet;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //主菜单
    public void menu(){
        System.out.println("欢迎来到学生管理系统");
    }


}
