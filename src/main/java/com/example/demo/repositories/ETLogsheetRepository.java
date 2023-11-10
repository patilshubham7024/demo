package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ETLogsheet;

@Repository
public interface ETLogsheetRepository extends JpaRepository<ETLogsheet, Long>{

}
