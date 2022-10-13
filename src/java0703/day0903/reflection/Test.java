package java0703.day0903.reflection;

import java.lang.reflect.Field;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-03 16:40
 **/
public class Test {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Student student = new Student();
        student.setAge(18);
        student.setName("张珊");
        Object copy = copy(student);
        System.out.println(copy);
        student.setName("123");
        System.out.println(copy);
        System.out.println("-----------");
        String s = toString(student);
        System.out.println(s);
    }
    //通过反射复制一个对象
    public static Object copy(Object obj) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        //1.获取Class对象
        Class<?> aClass =  obj.getClass();
        //2.反射创建对象
        Object object = aClass.newInstance();
        //3.给新的对象赋值
        //获取所有的属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            //设置可见性
            field.setAccessible(true);
            //得到原来的属性
            Object oldValue = field.get(obj);
            //给他赋值
            field.set(object,oldValue);
        }
        return object;
    }
    /**
     * 将一个对象装换成字符串
     * 类名{"属性名"：属性值，"属性名2"：属性值}
     */
    /* 方法1
    public static String toString(Object obj) throws IllegalAccessException, InstantiationException {
        //获取对象
        Class<?> aClass = obj.getClass();
        //获取类名
        String str = aClass.getSimpleName();
        //获取所有属性
        Field[] fields = aClass.getDeclaredFields();
        str +="{";
        //遍历 方法1
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            //获取属性名
            String name = fields[i].getName();
            Object oldValue = fields[i].get(obj);
            if (fields[i]==fields[fields.length-1]){
                str += "\""+name+"\":"+oldValue+"}";
            }else {
                str += "\""+name+"\":"+oldValue+",";
            }
        }
        return str;
    }

     */
    //方法2
    public static String toString(Object obj) throws IllegalAccessException, InstantiationException {
        StringBuffer str = new StringBuffer();
        //获取对象
        Class<?> aClass = obj.getClass();
        //获取类名
        String simpleName = aClass.getSimpleName();
        str.append(simpleName).append("{");
        //获取所有属性
        Field[] fields = aClass.getDeclaredFields();
        //遍历 方法1
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            str.append("\"").append(name).append("\"").append(":");
            Object o = field.get(obj);
            str.append(o).append(",");
        }
        //替换 ， 变成}
        str.setCharAt(str.length()-1,'}');
        return str.toString();
    }

}
