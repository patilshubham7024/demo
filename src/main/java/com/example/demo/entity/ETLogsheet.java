package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "R_101_ET_LOGSHEET")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ETLogsheet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("DATE TIME")
    @Column(name = "ET_DATE_TIME")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime etDateTime;

    @Column(name = "BATCH_NO")
    private String batchNo;

    @JsonProperty("ACTIVITY")
    @Column(name = "ACTIVITY")
    private String activity;

    @JsonProperty("ET WEIGHT (KG)")
    @Column(name = "ET_WEIGHT")
    private Float etWeight;

    @JsonProperty("DT WEIGHT (KG)")
    @Column(name = "DT_WEIGHT")
    private Float dtWeight;

    @JsonProperty("AGT RPM (ET)")
    @Column(name = "ET_AGT_RPM")
    private Float etAgtRpm;

    @JsonProperty("OPERATOR NAME")

    @Column(name = "ET_OPERATOR_NAME")
    private String etOperatorName;

    @Column(name = "SPARE1")
    private String spare1;

    @Column(name = "SPARE2")
    private String spare2;

    @Column(name = "SPARE3")
    private String spare3;

    @Column(name = "SPARE4")
    private String spare4;

    @Column(name = "SPARE5")
    private String spare5;
}
