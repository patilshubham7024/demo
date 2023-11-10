package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BatchReport;

@Repository
public interface BatchReportRepository extends JpaRepository<BatchReport, Long>{

}
