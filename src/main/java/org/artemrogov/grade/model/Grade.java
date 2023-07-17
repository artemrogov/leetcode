package org.artemrogov.grade.model;

import java.io.Serializable;
import java.util.Random;

public class Grade implements Serializable {
     private final Long id;

     private int value;

    public Grade() {
        this.id = new Random().nextLong();
    }

    public Grade(int value) {
        this.id = new Random().nextLong();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Long getId() {
        return id;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
