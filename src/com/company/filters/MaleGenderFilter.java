package com.company.filters;

import com.company.Gender;
import com.company.Person;

import java.util.ArrayList;
import java.util.List;

public class MaleGenderFilter implements Filterable {
    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> personList = new ArrayList<>();

        for (Person person : people){
            if(person.getGender() == Gender.MALE) personList.add(person);
        }

        return personList;
    }
}
