package com.example.springrestdocs.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestApi {

    private final TestService testService;

    @GetMapping(value = "/get")
    public TestResponseDto get() {
        return testService.get();
    }
}
