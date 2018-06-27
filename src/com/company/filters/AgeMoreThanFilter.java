package com.company.filters;

import com.company.Gender;
import com.company.Person;

import java.util.ArrayList;
import java.util.List;

public class AgeMoreThanFilter implements Filterable {

    private int age;

    public AgeMoreThanFilter(int age) {
        this.age = age;
    }

    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> personList = new ArrayList<>();

        for (Person person : people){
            if(person.getAge() > age) personList.add(person);
        }

        return personList;
    }
}
