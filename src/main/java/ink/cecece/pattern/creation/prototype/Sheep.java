package ink.cecece.pattern.creation.prototype;

import java.util.Date;

public class Sheep implements Cloneable {

    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public Sheep setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Sheep setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //实现深克隆
        Object object = super.clone();
        Sheep sheep = (Sheep)object;
        sheep.birthday = (Date) sheep.birthday.clone();

        return object;
    }
}
