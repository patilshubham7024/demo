package com.example.demo.repositories;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BatchReport;

@Repository
public interface BatchReportRepository extends JpaRepository<BatchReport, Long> {

	List<BatchReport> findByDateTimeBetween(LocalDate startDate, LocalDate endDate);

	Optional<BatchReport> findByBatchNo(String batchNo);
}
