package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "R_101_HEADER_LOGSHEET")
public class HeaderLogsheet{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "REACTOR_NAME")
    private String reactorName;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "BATCH_NO")
    private String batchNo;

    @Column(name = "BATCH_SIZE")
    private String batchSize;

    @Column(name = "TOTAL_BATCH_TIME")
    private Float totalBatchTime;

    @Column(name = "EMULSION_START_TIME")
    private Date emulsionStartTime;

    @Column(name = "EMULSION_END_TIME")
    private Date emulsionEndTime;

    @Column(name = "REACTOR_INITIAL_WEIGHT")
    private Float reactorInitialWeight;

    @Column(name = "REACTOR_FINAL_WEIGHT")
    private Float reactorFinalWeight;

    @Column(name = "REACTOR_START_TIME")
    private Date reactorStartTime;

    @Column(name = "REACTOR_END_TIME")
    private Date reactorEndTime;

    @Column(name = "WATER_PHASE_TIME")
    private Float waterPhaseTime;

    @Column(name = "SEED_TIME")
    private Float seedTime;

    @Column(name = "SEED_TEMP")
    private Float seedTemp;

    @Column(name = "SEED_QTY")
    private Float seedQty;

    @Column(name = "FEEDING_TIME")
    private Float feedingTime;

    @Column(name = "POST_ADDITION_TIME")
    private Float postAdditionTime;

    @Column(name = "QC_TIME")
    private Float qcTime;

    @Column(name = "DOWNING_TIME")
    private Float downingTime;

    @Column(name = "SBP_SEED_TEMP_RANGE")
    private Float sbpSeedTempRange;

    @Column(name = "SBP_SEED_QTY_KG")
    private Float sbpSeedQtyKg;

    @Column(name = "SBP_FEEDING_TIME_HR")
    private Float sbpFeedingTimeHr;

    @Column(name = "SBP_REACTION_TEMP")
    private Float sbpReactionTemp;

    @Column(name = "SBP_AFTER_FEEDING_HOLD_TIME")
    private Float sbpAfterFeedingHoldTime;

    @Column(name = "SBP_NH3_ADD_TEMP")
    private Float sbpNh3AddTemp;

    @Column(name = "SBP_TBHP_ADD_TEMP")
    private Float sbpTbhpAddTemp;

    @Column(name = "SBP_DECOLITE_ADD_TEMP")
    private Float sbpDecoliteAddTemp;

    @Column(name = "SBP_STD_BATCH_HR")
    private Float sbpStdBatchHr;

    @Column(name = "ETTC_CHECK1")
    private String ettcCheck1;

    @Column(name = "ETTC_CHECK2")
    private String ettcCheck2;

    @Column(name = "ETTC_CHECK3")
    private String ettcCheck3;

    @Column(name = "ETTC_CHECK4")
    private String ettcCheck4;

    @Column(name = "ETTC_CHECK5")
    private String ettcCheck5;

    // ... (continue for the remaining columns)

    @Column(name = "SPARE6")
    private String spare6;

    @Column(name = "SPARE7")
    private String spare7;

    // Constructors, getters, and setters

    // Additional annotations or configurations may be required based on your specific needs and ORM framework.
}
