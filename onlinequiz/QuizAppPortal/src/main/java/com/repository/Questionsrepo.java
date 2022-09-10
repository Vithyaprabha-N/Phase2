package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Questions;

@Repository
public interface Questionsrepo extends JpaRepository<Questions, Integer> {

}