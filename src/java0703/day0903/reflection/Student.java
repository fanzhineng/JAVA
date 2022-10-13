package java0703.day0903.reflection;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 14:47
 **/
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        System.out.println("无惨构造器");
    }

    private Student(String name, int age) {
        System.out.println("有参构造器");
        this.name = name;
        this.age = age;
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


    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
