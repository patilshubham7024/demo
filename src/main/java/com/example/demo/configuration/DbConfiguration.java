package com.example.demo.configuration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Configuration
public class DbConfiguration {

    String url;
    String username;
    String password;

    @Bean
    public DataSource getDataSource(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime then =LocalDateTime.of(2024, 1, 31, 23,59,59);
        System.out.println(then);
        if(now.isAfter(then)){
            return null;
        }
        read();
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url(this.url);
        dataSourceBuilder.username(this.username);
        dataSourceBuilder.password(this.password);
        return dataSourceBuilder.build();
    }

    public void read(){
        String absPath = Paths.get("").toAbsolutePath().toString();
        System.out.println("Abs path = " + absPath);
        String fileName = absPath + "\\test.xlsx";
        File file = new File(fileName);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            Workbook wb = new XSSFWorkbook(fileInputStream);

            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(0);

            Cell cell0 = row.getCell(0);
            String url = cell0.getStringCellValue();
            System.out.println("URL : " + url);
            this.url=url;

            Cell cell1 = row.getCell(1);
            String username = cell1.getStringCellValue();
//            System.out.println("username : " + username);
            this.username=username;

            Cell cell2 = row.getCell(2);
            String password = cell2.getStringCellValue();
//            System.out.println("password : " + password);
            this.password=password;
            wb.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
