package org.artemrogov.grade.dao.impl;

import org.artemrogov.grade.dao.IPersonRepository;
import org.artemrogov.grade.model.Grade;
import org.artemrogov.grade.model.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonRepositoryImpl implements IPersonRepository {

    private final Map<Long,Person> data;

    public PersonRepositoryImpl() {
        this.data = new HashMap<>();
    }

    @Override
    public Collection<Grade> getGrades(Long idPerson) {
        return this.getById(idPerson).getGrades().values();
    }

    @Override
    public void addNotes(Long id, Map<Long, Grade> grades) {
         Person person = this.getById(id);
         person.setGrades(grades);
    }

    @Override
    public void add(Person model) {
        this.data.put(model.getId(),model);
    }

    @Override
    public void addAll(Collection<Person> persons) {
        persons.forEach(person-> this.data.put(person.getId(),person));
    }

    @Override
    public Collection<Person> getData() {
        return this.data.values();
    }

    @Override
    public Person getById(Long index) {
        return this.data.get(index);
    }

    @Override
    public void destroy(Long index) {
        this.data.remove(index);
    }
}
