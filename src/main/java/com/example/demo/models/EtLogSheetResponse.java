package com.example.demo.models;

import com.example.demo.entity.ETLogsheet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
public class EtLogSheetResponse implements Serializable {
    private String status;
    private List<ETLogsheet> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ETLogsheet> getData() {
        return data;
    }

    public void setData(List<ETLogsheet> data) {
        this.data = data;
    }
}
