package ru.aleks_pochta_krd;

public class Human {

    final String name;
    final int age;
    final String sex;

    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
}
