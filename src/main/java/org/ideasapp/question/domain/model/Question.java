package org.ideasapp.question.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Question {

    private UUID id;
    private String name;

    public Question() {}

    public Question(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
