package com.back.jumpToSpringBoot.answer.form;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotBlank(message = "내용을 입력해주세요")
    @Size(max=100)
    private String content;
}
