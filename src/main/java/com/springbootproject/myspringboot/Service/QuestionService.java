package com.springbootproject.myspringboot.Service;

//import com.springbootproject.myspringboot.Repository.QuestionRepository;
import com.springbootproject.myspringboot.Entity.questionEntity;
import com.springbootproject.myspringboot.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;

    public List<questionEntity> getAllQuestions() {
         return repository.findAll();
    }

    public List<questionEntity> getQuestionByCategory(String category) {
        return repository.getByCategory(category);
    }
}
