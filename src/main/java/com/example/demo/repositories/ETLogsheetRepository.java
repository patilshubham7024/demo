package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ETLogsheet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ETLogsheetRepository extends JpaRepository<ETLogsheet, Long>{

    List<ETLogsheet> findByEtDateTimeBetweenOrderByBatchNo(LocalDateTime startDate, LocalDateTime endDate);
    List<ETLogsheet> findByBatchNoOrderByEtDateTimeAsc(String batchNo);
}
