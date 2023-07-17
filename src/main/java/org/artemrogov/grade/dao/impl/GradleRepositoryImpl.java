package org.artemrogov.grade.dao.impl;

import org.artemrogov.grade.dao.IGradleRepository;
import org.artemrogov.grade.model.Grade;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GradleRepositoryImpl implements IGradleRepository {

    private final Map<Long, Grade> data = new HashMap<>();
    @Override
    public void add(Grade model) {
        this.data.put(model.getId(),model);
    }

    @Override
    public void addAll(Collection<Grade> gradles) {
        gradles.forEach(gradle-> this.data.put(gradle.getId(),gradle));
    }

    @Override
    public Collection<Grade> getData() {
        return this.data.values();
    }

    @Override
    public Grade getById(Long index) {
        return this.data.get(index);
    }

    @Override
    public void destroy(Long index) {
        this.data.remove(index);
    }
}
