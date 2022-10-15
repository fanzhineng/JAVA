package com.fzn2022.day03.list_.copyonwritearrayList_;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: JAVA
 *          CopyOnWriteArrayList
 * 描述：      它相当于线程安全的ArrayList。和ArrayList一样，它是个可变数组；
 *          1. 它最适合于具有以下特征的应用程序：
 *              List 大小通常保持很小，只读操作远多于可变操作，需要在遍历期间防止线程间的冲突。
 *          2. 它是线程安全的。
 *          3. 因为通常需要复制整个基础数组，所以可变操作（add()、set() 和 remove() 等等）的开销很大。
 *          4. 迭代器支持hasNext(), next()等不可变操作，但不支持可变 remove()等操作。
 *          5. 使用迭代器进行遍历的速度很快，并且不会与其他线程发生冲突。在构造迭代器时，迭代器依赖于不变的数组快照
 *
 *
 *   底层实现原理：
 *      1. CopyOnWriteArrayList实现了List接口，因此它是一个队列。
 *      2. CopyOnWriteArrayList包含了成员lock。
 *          每一个CopyOnWriteArrayList都和一个监视器锁lock绑定，
 *          通过lock，实现了对CopyOnWriteArrayList的互斥访问。
 *      3. CopyOnWriteArrayList包含了成员array数组，这说明CopyOnWriteArrayList本质上通过数组实现的。
 *      4.CopyOnWriteArrayList的“动态数组”机制 --
 *          它内部有个“volatile数组”(array)来保持数据。
 *          在“添加/修改/删除”数据时，都会新建一个数组，
 *          并将更新后的数据拷贝到新建的数组中，
 *          最后再将该数组赋值给“volatile数组”。
 *          这就是它叫做CopyOnWriteArrayList的原因！
 *          CopyOnWriteArrayList就是通过这种方式实现的动态数组；
 *          不过正由于它在“添加/修改/删除”数据时，都会新建数组，所以涉及到修改数据的操作，
 *          CopyOnWriteArrayList效率很 低；但是单单只是进行遍历查找的话，效率比较高。
 *      5.CopyOnWriteArrayList的“线程安全”机制
 *          -- 是通过volatile和监视器锁Synchrnoized来实现的。
 *      6.CopyOnWriteArrayList是通过“volatile数组”来保存数据的。
 *          一个线程读取volatile数组时，总能看到其它线程对该volatile变量最后的写入；
 *          就这样，通过volatile提供了“读取到的数据总是最新的”这个机制的 保证。
 *      7.CopyOnWriteArrayList通过监视器锁Synchrnoized来保护数据。
 *          在“添加/修改/删除”数据时，会先“获取监视器锁”，再修改完毕之后，
 *          先将数据更新到“volatile数组”中，然后再“释放互斥锁”；这样，就达到了保护数据的目的。
 *
 * @author: fzn
 * @create: 2022-10-15 12:05
 **/
public class CopyOnWriteArrayList_ {
    public static void main(String[] args) {
        CopyOnWriteArrayList copy = new CopyOnWriteArrayList();
        copy.add("a");
        copy.add("a");
        copy.add("a");
        copy.add("a");
        System.out.println(copy);
        /*
        优点
            读操作性能很高，因为无需任何同步措施，比较适用于读多写少的并发场景。
            Java的List在遍历时，若中途有别的线程对List容器进行修改，
            则会抛出ConcurrentModificationException异常。
            而CopyOnWriteArrayList由于其"读写分离"的思想，遍历和修改操作分别作用在不同的List容器，
            所以在使用迭代器进行遍历时候，也就不会抛出ConcurrentModificationException异常了


         缺点
            1、由于写操作的时候，需要拷贝数组，会消耗内存，如果原数组的内容比较多的情况下，可能导致young gc或者full gc。
                （①、young gc ：年轻代（Young Generation）：
                    对象被创建时，内存的分配首先发生在年轻代（大对象可以直接被创建在年老代），
                    大部分的对象在创建后很快就不再使用，因此很快变得不可达，
                    于是被年轻代的GC机制清理掉（IBM的研究表明，98%的对象都是很快消亡的），这个GC机制被称为Minor GC或叫Young GC。
                ②、年老代（Old Generation）：
                    对象如果在年轻代存活了足够长的时间而没有被清理掉（即在几次Young GC后存活了下来），
                    则会被复制到年老代，年老代的空间一般比年轻代大，能存放更多的对象，
                    在年老代上发生的GC次数也比年轻代少。当年老代内存不足时，将执行Major GC，也叫 Full GC）

            2、不能用于实时读的场景，像拷贝数组、新增元素都需要时间，
                所以调用一个set操作后，读取到数据可能还是旧的,
                虽然CopyOnWriteArrayList 能做到最终一致性,但是还是没法满足实时性要求
         */
    }
}