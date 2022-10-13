package java0703.day0831.io;

import java.io.Serializable;
import java.util.Objects;

/**
 * @program: JAVA
 * 描述：      学生实体类
 * @author: fzn
 * @create: 2020-08-31 10:32
 **/
public class Student implements Serializable{
    //版本号的含义？当序列号的对象反序列化时，如果与现在的类版本号不一致，则会报错
    //如果不指定版本号，默认会生成一个，只要改变该类的内容，版本号就会发生改变。设定版本号可以使其兼容（类只修改了方法，反序列化回来不会报错）
    private static final long serialVersionUID = -936105725921287135L;
    private String name;
    private int age;
    private String clazz;

    public Student() {
    }

    public Student(String name, int age, String clazz) {
        this.name = name;
        this.age = age;
        this.clazz = clazz;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 重写equals和hashcode方法
     * 保证equals 相等 hashcode一定相等。
     * equals相等 hashcode可以相等也可以不等
     * hashcode值不相等 equal一定不等
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
