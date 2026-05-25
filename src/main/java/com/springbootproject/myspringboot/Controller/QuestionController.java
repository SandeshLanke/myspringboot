package com.springbootproject.myspringboot.Controller;

import com.springbootproject.myspringboot.Entity.questionEntity;
import com.springbootproject.myspringboot.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public List<questionEntity> allQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/category/{category}")
    public List<questionEntity> getQuestionByCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

}
