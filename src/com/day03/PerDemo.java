package com.day03;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-07-22 15:47
 **/
public class PerDemo {
    public static void main(String[] args) {
        Dor d = new Dor(101,"dd","内科");
        System.out.println(d.id+" "+d.name+" "+d.hos);
        d.eat();//子类调用父类的方法
        d.dos();
        Teacher t = new Teacher(102,"te","教室");
        System.out.println(t.id+" "+t.name+" "+t.sch);
        t.eat();
        t.tos();
    }

}
//父类
class Person{
    int id;//身份证号
    String name;//名字
    public void eat(){
        System.out.println("人吃食物");
    }
    //构造器

    //有参构造器
    public Person(int id,String name){
        this.id  = id;
        this.name = name;
    }

}
//子类1 医生
class Dor extends Person{
    String hos;//医务室
    public void dos(){
        System.out.println("医生做手术");
    }

    //重写父类吃饭的方法 覆盖
    @Override
    public void eat() {
        System.out.println("医生在医院吃饭");
    }

    //有参构造器
    public Dor(int id,String name,String hos){
        super(id,name);
        this.hos = hos;
    }
}
//子类2 老师
class Teacher extends Person{
    String sch;//学校
    public void tos(){
        System.out.println("老师教学生");
    }

    //重写父类吃饭的方法 覆盖
    @Override
    public void eat(){
        System.out.println("老师在学校吃饭");
    }
    //无参
    //有参构造器
    public Teacher(int id,String name,String sch){
        super(id,name);
        this.sch = sch;
    }
}
