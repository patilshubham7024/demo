package com.example.demo.entity;

import java.util.Date;

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
@Table(name = "R_101_RT_LOGSHEET")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RTLogsheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RT_DATE_TIME")
    private Date rtDateTime;

    @Column(name = "BATCH_NO")
    private String batchNo;

    @Column(name = "ACTIVITY")
    private String activity;

    @Column(name = "RT_TEPM")
    private Float rtTepm;

    @Column(name = "RT_AGT_RPM")
    private Float rtAgtRpm;

    @Column(name = "ET_AGT_RPM")
    private Float etAgtRpm;

    @Column(name = "ET_SET_FEED_RATE")
    private Float etSetFeedRate;

    @Column(name = "ET_ACTUAL_FEED_RATE")
    private Float etActualFeedRate;

    @Column(name = "CT_SET_FEED_RATE")
    private Float ctSetFeedRate;

    @Column(name = "CT_ACTUAL_FEED_RATE")
    private Float ctActualFeedRate;

    @Column(name = "ET_WEIGHT")
    private Float etWeight;

    @Column(name = "RT_WEIGHT")
    private Float rtWeight;

    @Column(name = "RT_OPERATOR_NAME")
    private String rtOperatorName;

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
