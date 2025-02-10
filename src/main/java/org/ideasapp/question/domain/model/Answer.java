package org.ideasapp.question.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Answer {

    private UUID id;
    private String name;

    public Answer() {}

    public Answer(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
