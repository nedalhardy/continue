package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
public class TestController {

    @GetMapping
    public ResponseEntity test(@RequestBody Test test) throws JsonProcessingException {
        ResultDetail<List<String>> resultDetail = new ResultDetail<List<String>>();
        List<String> list = new ArrayList<>();
        list.add("kaka");
        resultDetail.setResult(list);
        return new ResponseEntity(resultDetail, HttpStatus.OK);
    }

    @GetMapping("/ok")
    public ResponseEntity test2(@RequestBody Test test) throws JsonProcessingException {
        ResultDetail<String> resultDetail = new ResultDetail<String>();
        resultDetail.setResult("hahaha");
        return new ResponseEntity(resultDetail, HttpStatus.OK);
    }
}
