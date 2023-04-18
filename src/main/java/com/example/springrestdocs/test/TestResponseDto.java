package com.example.springrestdocs.test;

import lombok.Getter;

@Getter
public class TestResponseDto {

    public String value1;

    public TestResponseDto(String value1) {
        this.value1 = value1;
    }
}
