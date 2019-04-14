package com.example.demo;

import lombok.Data;

@Data
public class ResultDetail<T> {
    private String queryType;
    private String timestamp;
    private T result;
}
