package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.example.demo.models.constants.Constants.DATE_TIME_FORMAT;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoClaveDto implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    @JsonProperty("DATE & TIME")
    private LocalDateTime dateTime;
    @JsonProperty("STEP NAME")
    private String stepName;
    @JsonProperty("RFT1")
    private Double rFT1;
    @JsonProperty("RFT1-F0")
    private Double rFT1F0;
    @JsonProperty("RFT2")
    private Double rFT2;
    @JsonProperty("RFT2-F0")
    private Double rFT2F0;
    @JsonProperty("RFT3")
    private Double rFT3;
    @JsonProperty("RFT3-F0")
    private Double rFT3F0;
    @JsonProperty("RFT4")
    private Double rFT4;
    @JsonProperty("RFT4-F0")
    private Double rFT4F0;
    @JsonProperty("TC1")
    private Double tC1;
    @JsonProperty("TS1")
    private Double tS1;
    @JsonProperty("PRESSURE")
    private Double pressure;
    @JsonProperty("WATER LEVEL")
    private Double waterLevel;
}
