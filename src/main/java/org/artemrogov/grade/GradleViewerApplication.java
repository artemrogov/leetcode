package org.artemrogov.grade;

import org.artemrogov.grade.dao.IPersonRepository;
import org.artemrogov.grade.dao.impl.PersonRepositoryImpl;
import org.artemrogov.grade.model.Person;

public class GradleViewerApplication {
    public static void main(String[] args) {
        IPersonRepository personRepository = new PersonRepositoryImpl();
        Person person1 = new Person();
        person1.setName("Test Person");
        personRepository.add(person1);

        for (Person person : personRepository.getData()){
            System.out.println("id: " + person.getId() + " name:" + person.getName());
        }
    }
}
