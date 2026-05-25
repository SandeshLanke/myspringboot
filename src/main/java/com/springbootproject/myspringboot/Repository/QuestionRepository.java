package com.springbootproject.myspringboot.Repository;

import com.springbootproject.myspringboot.Entity.questionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<questionEntity, Integer> {
    public List<questionEntity> getByCategory(String category);
}
