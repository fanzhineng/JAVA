package java0703.day0905.tcp;

import java.io.Serializable;

/**
 * @program: JAVA
 * 描述：
 * @author: fzn
 * @create: 2020-09-07 15:36
 **/
public class Goods implements Serializable {
    private static final long serialVersionUID = 1298664467584867735L;
    private String name;
    private double price;
    private String unit;
    private Integer num;
    private String ID;

    public Goods() {
    }

    public Goods(String name, double price, String unit, Integer num, String ID) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.num = num;
        this.ID = ID;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", num=" + num +
                ", ID='" + ID + '\'' +
                '}';
    }
}
