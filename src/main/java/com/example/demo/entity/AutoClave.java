package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutoClave {
    @Id
    private Long id;
    private LocalDateTime dateTime;
    private String stepName;
    private Double rFT1;
    private Double rFT1F0;
    private Double rFT2;
    private Double rFT2F0;
    private Double rFT3;
    private Double rFT3F0;
    private Double rFT4;
    private Double rFT4F0;
    private Double tC1;
    private Double tS1;
    private Double pressure;
    private Double waterLevel;
}
