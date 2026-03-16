package com.back.jumpToSpringBoot.question.repository;

import com.back.jumpToSpringBoot.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
