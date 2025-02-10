package org.ideasapp.question.controller;

import org.ideasapp.question.domain.model.Answer;
import org.ideasapp.question.domain.model.Question;
import org.ideasapp.question.service.AnswerService;
import org.ideasapp.question.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/questions/{question-id}/answers")
public class AnswerController {

    private final AnswerService answerService;


    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    List<Answer> getQuestions(@PathVariable UUID questionId) {
        return answerService.getAnswers(questionId);
    }

    @GetMapping("{answer-id}")
    Answer getAnswer(@PathVariable("question-id") UUID questionId, @PathVariable("answer-id") UUID answerId) {
        return answerService.getAnswer(answerId);
    }

    @PostMapping
    Answer createAnswer(@PathVariable("question-id") UUID questionId, @RequestBody Answer answer){
        return answerService.createAnswer(questionId, answer);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PutMapping("{answer-id}")
    Answer updateAnswer(@PathVariable("question-id") UUID questionId, @PathVariable("answer-id") UUID answerId,
                        @RequestBody Answer answer){
        return answerService.updateAnswer(answerId, answer);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{answer-id}")
    void deleteAnswer(@PathVariable("answer-id") UUID answerId){
        answerService.deleteAnswer(answerId);
    }
}
