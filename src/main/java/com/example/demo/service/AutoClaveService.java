package com.example.demo.service;

import com.example.demo.models.AutoClaveDto;
import com.example.demo.models.AutoClaveResponse;
import com.example.demo.models.Filter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.Tuple;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AutoClaveService {

    @PersistenceContext
    private EntityManager entityManager;

    public AutoClaveResponse getAutoClave(Filter filter) {
        List<AutoClaveDto> autoClaves = new ArrayList<>();
        String query = "select * from test.auto_clave" +
                " where 1=1 ";

        if (filter.getDateTimeMax() != null) {
            query += " and date_time <= '" + filter.getDateTimeMax() + "'";
        }
        if (filter.getDateTimeMin() != null) {
            query += " and date_time >= '" + filter.getDateTimeMin() + "'";
        }
        if (!StringUtils.isEmpty(filter.getStepName())) {
            query += " and step_name like '%" + filter.getStepName() + "%'";
        }
        if (filter.getRFT1Min() != null) {
            query += " and rFT1 >=" + filter.getRFT1Min();
        }
        if (filter.getRFT1Max() != null) {
            query += " and rFT1 <=" + filter.getRFT1Max();
        }
        if (filter.getRFT1F0Min() != null) {
            query += " and rFT1F0 >=" + filter.getRFT1F0Min();
        }
        if (filter.getRFT1F0Max() != null) {
            query += " and rFT1F0 <=" + filter.getRFT1F0Max();
        }
        if (filter.getRFT2Min() != null) {
            query += " and rFT2 >=" + filter.getRFT2Min();
        }
        if (filter.getRFT2Max() != null) {
            query += " and rFT2 <=" + filter.getRFT2Max();
        }
        if (filter.getRFT2F0Min() != null) {
            query += " and rFT2F0 >=" + filter.getRFT2F0Min();
        }
        if (filter.getRFT2F0Max() != null) {
            query += " and rFT2F0 <=" + filter.getRFT2F0Max();
        }
        if (filter.getRFT3Min() != null) {
            query += " and rFT3 >=" + filter.getRFT3Min();
        }
        if (filter.getRFT3Max() != null) {
            query += " and rFT3 <=" + filter.getRFT3Max();
        }
        if (filter.getRFT3F0Min() != null) {
            query += " and rFT3F0 >=" + filter.getRFT3F0Min();
        }
        if (filter.getRFT3F0Max() != null) {
            query += " and rFT3F0 <=" + filter.getRFT3F0Max();
        }
        if (filter.getRFT4Min() != null) {
            query += " and rFT4 >=" + filter.getRFT4Min();
        }
        if (filter.getRFT4Max() != null) {
            query += " and rFT4 <=" + filter.getRFT4Max();
        }
        if (filter.getRFT4F0Min() != null) {
            query += " and rFT4F0 >=" + filter.getRFT4F0Min();
        }
        if (filter.getRFT4F0Max() != null) {
            query += " and rFT4F0 <=" + filter.getRFT4F0Max();
        }
        if (filter.getTC1Min() != null) {
            query += " and tC1 <=" + filter.getTC1Min();
        }
        if (filter.getTC1Max() != null) {
            query += " and tC1 >=" + filter.getTC1Max();
        }
        if (filter.getTS1Min() != null) {
            query += " and tS1 <=" + filter.getTS1Min();
        }
        if (filter.getTS1Max() != null) {
            query += " and tS1 >=" + filter.getTS1Max();
        }
        if (filter.getPressureMin() != null) {
            query += " and pressure >=" + filter.getPressureMin();
        }
        if (filter.getPressureMax() != null) {
            query += " and pressure <=" + filter.getPressureMax();
        }
        if (filter.getWaterLevelMin() != null) {
            query += " and water_level >=" + filter.getWaterLevelMin();
        }
        if (filter.getWaterLevelMax() != null) {
            query += " and water_level <=" + filter.getWaterLevelMax();
        }

        Query nativeQuery = entityManager.createNativeQuery(query, Tuple.class);
        List<Tuple> resultList = nativeQuery.getResultList();
        for (Tuple tuple : resultList) {
            autoClaves.add(AutoClaveDto.builder()
                    .dateTime(((Timestamp) tuple.get("date_time")).toLocalDateTime())
                    .stepName(tuple.get("step_name").toString())
                    .rFT1(Double.parseDouble(tuple.get("rft1").toString()))
                    .rFT1F0(Double.parseDouble(tuple.get("rft1f0").toString()))
                    .rFT2(Double.parseDouble(tuple.get("rft2").toString()))
                    .rFT2F0(Double.parseDouble(tuple.get("rft2f0").toString()))
                    .rFT3(Double.parseDouble(tuple.get("rft3").toString()))
                    .rFT3F0(Double.parseDouble(tuple.get("rft3f0").toString()))
                    .rFT4(Double.parseDouble(tuple.get("rft4").toString()))
                    .rFT4F0(Double.parseDouble(tuple.get("rft4f0").toString()))
                    .tC1(Double.parseDouble(tuple.get("tc1").toString()))
                    .tS1(Double.parseDouble(tuple.get("ts1").toString()))
                    .pressure(Double.parseDouble(tuple.get("pressure").toString()))
                    .waterLevel(Double.parseDouble(tuple.get("water_level").toString()))
                    .build());
        }
        return AutoClaveResponse.builder()
                .data(autoClaves)
                .machineName("HOT WATER SPRAY STERILIZER AUTOCLAVE-III- BATCH REPORT")
                .productName("Autoclave-3")
                .batchNo("Batch test")
                .lotNo("2")
                .cycleNo("10")
                .packSizeInMl("150")
                .timeInterval("10")
                .programNo("1")
                .cycleStartDateTime(LocalDateTime.now())
                .cycleEndDateTime(LocalDateTime.now())
                .coolingTemperature(54.5)
                .overheating(0.0)
                .sterilizationTemperature(107.0)
                .plusTempLimit(1.0)
                .minusTempLimit(0.0)
                .sterilizationTime(10d)
                .chamberPressureLimitDuringHeating(1d)
                .chamberPressureSterilizationTemp(1.40)
                .chamberPressureAtStartCooling(1.50)
                .chamberPressureAtEndOfCooling(0.03)
                .chamberPressureAfterDrain(0.0)
                .purifiedWaterLevel(74.0)
                .build();
    }
}
