package org.ideasapp.question.service;

import org.ideasapp.question.domain.model.Answer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class AnswerService {
    public List<Answer> getAnswers(UUID questionId) {
        return Arrays.asList(new Answer("Answer 1"),  new Answer("Answer 2"));
    }

    public Answer getAnswer(UUID answerId) {
        return null;
    }

    public Answer createAnswer(UUID questionId, Answer answer) {
        return null;
    }

    public Answer updateAnswer(UUID answerId, Answer answer) {
        return null;
    }

    public void deleteAnswer(UUID answerId) {

    }
}
