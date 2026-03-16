package com.back.jumpToSpringBoot.answer.repository;

import com.back.jumpToSpringBoot.answer.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
