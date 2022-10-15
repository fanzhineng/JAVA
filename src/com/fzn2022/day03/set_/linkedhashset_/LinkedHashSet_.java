package com.fzn2022.day03.set_.linkedhashset_;


import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @program: JAVA
 * 描述：      LinkedHashSet
 *
 *            结构说明
 *              1. 是 HashSet 的子类 继承了HashSet
 *              2. 底层是 LinkedHashMap 底层维护一个数组+双向链表
 *              3. 根据元素的 hashCode 值来决定元素的存储位置 同时使用链表维护元素的次序图
 *                  这使得元素看起来是以插入顺序来保存的
 *              4. 不允许重复添加元素
 *            底层源码实现：
 *              1. 在LinkedHashSet中维护了一个hash表和双向链表
 *                      LinkedHashSet 有 head 和 tail
 *              2. 每一个节点有before 和after属性 这样可以形成双向链表
 *              3. 在添加一个元素的时候，先求hash值 再求索引 确定该元素在table的位置 然后将添加的元素加入到双向链表中
 *                     如果已经存在 不添加
 *               tail = newElement
 *               newElement.pre = taill
 *               tail = newElement
 *              4. 这样的话 我们遍历 LinkedHashSet也能确保插入顺序和遍历顺序一致
 *
 * @author: fzn
 * @create: 2022-10-15 10:44
 **/
@SuppressWarnings({"all"})
public class LinkedHashSet_ {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//OK
        linkedHashSet.add(new Car("法拉利", 10000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        linkedHashSet.add(new Car("保时捷", 70000000));//OK
        linkedHashSet.add(new Car("奥迪", 300000));//加入不了
        System.out.println("linkedHashSet=" + linkedHashSet);
    }
}
/**
 * Car 类(属性:name,price)， 如果 name 和 price 一样，
 * 则认为是相同元素，就不能添加。 5min
 */
class Car {
    private String name;
    private double price;
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //重写 equals 方法 和 hashCode
    //当 name 和 price 相同时， 就返回相同的 hashCode 值, equals 返回 t
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}