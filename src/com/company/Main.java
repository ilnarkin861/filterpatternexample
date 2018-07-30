package com.company;

import com.company.filters.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(Gender.MALE, 20));
        people.add(new Person(Gender.MALE, 30));
        people.add(new Person(Gender.FEMALE, 25));

        Filterable f = new AgeMoreThanFilter(20);
        List<Person> filter = f.filter(people);

        filter.forEach((i)-> System.out.println(i));
        System.out.println("...........");

        // Predicate
        people.stream().filter(i->i.getGender()==Gender.MALE).forEach(i-> System.out.println(i));


    }
}
