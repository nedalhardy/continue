package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Data {
    one("one"), two("two"), three("three");

    private String name;

    Data(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @JsonCreator
    public static Data fromString(String input) {
        for (Data projectVersion : com.example.demo.Data.values()) {
            if (projectVersion.name.equals(input)) {
                return projectVersion;
            }
        }
        return null;
    }
}
