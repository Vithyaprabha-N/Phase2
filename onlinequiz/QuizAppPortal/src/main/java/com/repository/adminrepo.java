package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.admin;

@Repository
public interface adminrepo extends JpaRepository<admin, Integer> {

}