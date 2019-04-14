package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.validation.constraints.NotNull;

@lombok.Data
public class Test {

    @EnumValidator( enumClazz=Data.class,message="value not found")
    private String data;

    private String name;
}