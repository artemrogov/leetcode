package org.artemrogov.grade.dao;

import java.util.Collection;

interface IStorageRepository<T,I>{
    void add(T model);

    void addAll(Collection<T> data);

    Collection<T> getData();

    T getById(I index);

    void destroy(I index);
}
