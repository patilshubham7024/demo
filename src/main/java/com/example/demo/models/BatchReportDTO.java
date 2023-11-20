package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchReportDTO {
    // Headers section
    private String batchNo;
    private String batchSize;
    private String reactor;
    private String reactorName;
    private LocalDate effectiveDate;
    private String productName;
    private Phases dataTable;
}
