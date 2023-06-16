package com.example.demo.controller;

import com.example.demo.models.Filter;
import com.example.demo.service.AutoClaveService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autoclave")
@Log4j2
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AutoClaveController {

    @Autowired
    private AutoClaveService autoClaveService;

    @PostMapping("/get")
    public ResponseEntity<?> get(@RequestBody Filter filter) {
        return new ResponseEntity<>(autoClaveService.getAutoClave(filter), HttpStatus.OK);
    }

}
