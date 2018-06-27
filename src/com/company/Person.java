package com.company;

public class Person {

    private Gender gender;
    private int age;

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender=" + gender +
                ", age=" + age +
                '}';
    }
}
