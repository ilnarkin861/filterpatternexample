package com.company.filters;

import com.company.Person;

import java.util.List;

public interface Filterable {

    List<Person> filter(List<Person> people);
}
