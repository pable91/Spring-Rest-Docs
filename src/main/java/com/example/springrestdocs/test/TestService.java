package com.example.springrestdocs.test;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public TestResponseDto get() {
        return new TestResponseDto("get");
    }

    public TestResponseDto post(TestRequestDto testRequestDto) {
        String value1 = testRequestDto.getValue1();
        TestResponseDto testResponseDto = new TestResponseDto(value1);
        return testResponseDto;
    }
}
