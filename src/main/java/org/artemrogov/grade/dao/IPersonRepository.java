package org.artemrogov.grade.dao;


import org.artemrogov.grade.model.Grade;
import org.artemrogov.grade.model.Person;

import java.util.Collection;
import java.util.Map;

public interface IPersonRepository extends IStorageRepository<Person,Long> {
    Collection<Grade> getGrades(Long idPerson);

    void addNotes(Long id, Map<Long,Grade> grades);
}
