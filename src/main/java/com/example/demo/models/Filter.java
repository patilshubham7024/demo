package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Filter implements Serializable {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    private LocalDateTime dateTimeMin;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_TIME_FORMAT)
    private LocalDateTime dateTimeMax;
    private String stepName;
    @JsonAlias("rFT1Min")
    private Double rFT1Min;
    @JsonAlias("rFT1Max")
    private Double rFT1Max;
    @JsonAlias("rFT1F0Min")
    private Double rFT1F0Min;
    @JsonAlias("rFT1F0Max")
    private Double rFT1F0Max;
    @JsonAlias("rFT2Min")
    private Double rFT2Min;
    @JsonAlias("rFT2Max")
    private Double rFT2Max;
    @JsonAlias("rFT2F0Min")
    private Double rFT2F0Min;
    @JsonAlias("rFT2F0Max")
    private Double rFT2F0Max;
    @JsonAlias("rFT3Min")
    private Double rFT3Min;
    @JsonAlias("rFT3Max")
    private Double rFT3Max;
    @JsonAlias("rFT3F0Min")
    private Double rFT3F0Min;
    @JsonAlias("rFT3F0Max")
    private Double rFT3F0Max;
    @JsonAlias("rFT4Min")
    private Double rFT4Min;
    @JsonAlias("rFT4Max")
    private Double rFT4Max;
    @JsonAlias("rFT4F0Min")
    private Double rFT4F0Min;
    @JsonAlias("rFT4F0Max")
    private Double rFT4F0Max;
    private Double tC1Min;
    private Double tC1Max;
    private Double tS1Min;
    private Double tS1Max;
    private Double pressureMin;
    private Double pressureMax;
    private Double waterLevelMin;
    private Double waterLevelMax;
    private Integer pageNumber;
}
