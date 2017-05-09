package com.example.dao;

import com.example.domain.Person;

import java.util.List;

public interface PersonDao {
    void add(Person person);
    List<Person> find();
}
