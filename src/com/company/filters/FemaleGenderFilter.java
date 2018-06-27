package com.company.filters;

import com.company.Gender;
import com.company.Person;

import java.util.ArrayList;
import java.util.List;

public class FemaleGenderFilter implements Filterable{
    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> personList = new ArrayList<>();

        for (Person person : people){
            if(person.getGender() == Gender.FEMALE) personList.add(person);
        }

        return personList;
    }
}
