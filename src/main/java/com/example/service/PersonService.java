package com.example.service;

import com.example.domain.Person;

import java.util.List;

/**
 * Created by MattyG on 5/9/17.
 */

public interface PersonService {
    void add(Person person);
    List<Person> find();
    void add(List<Person> persons);
}
