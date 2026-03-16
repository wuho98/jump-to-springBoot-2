package com.back.jumpToSpringBoot.answer.service;

import com.back.jumpToSpringBoot.answer.entity.Answer;
import com.back.jumpToSpringBoot.answer.repository.AnswerRepository;
import com.back.jumpToSpringBoot.question.entity.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answerRepository.save(answer);
    }
}
