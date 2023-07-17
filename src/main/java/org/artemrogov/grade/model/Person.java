package org.artemrogov.grade.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Person implements Serializable {
    private final Long id;
    private String name;
    private Map<Long,Grade> grades = new HashMap<>();

    public Person() {
        this.id = new Random().nextLong();
    }


    public Person(String name) {
        this.id = new Random().nextLong();
        this.name = name;
    }

    public Person(String name, Map<Long, Grade> grades) {
        this.id = new Random().nextLong();
        this.name = name;
        this.grades = grades;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Long, Grade> getGrades() {
        return grades;
    }

    public void setGrades(Map<Long, Grade> grades) {
        this.grades = grades;
    }
}
