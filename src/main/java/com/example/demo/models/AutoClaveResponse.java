package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import static com.example.demo.models.constants.Constants.DATE_TIME_FORMAT;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoClaveResponse {
    private List<AutoClaveDto> data;

    //Batch details
    private String machineName;
    private String productName;
    private String batchNo;
    private String lotNo;
    private String cycleNo;
    private String packSizeInMl;
    private String timeInterval;
    private String programNo;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    private LocalDateTime cycleStartDateTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    private LocalDateTime cycleEndDateTime;

    //Parameters
    private Double coolingTemperature;
    private Double overheating;
    private Double sterilizationTemperature;
    private Double plusTempLimit;
    private Double minusTempLimit;
    private Double sterilizationTime;
    private Double chamberPressureLimitDuringHeating;
    private Double chamberPressureSterilizationTemp;
    private Double chamberPressureAtStartCooling;
    private Double chamberPressureAtEndOfCooling;
    private Double chamberPressureAfterDrain;
    private Double purifiedWaterLevel;
}
