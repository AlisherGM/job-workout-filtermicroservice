package com.alisher.filter.controller;

import com.alisher.filter.adapter.BackendAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FilterEndpointController {
    private final BackendAdapter backendAdapter;

    @GetMapping("/")
    public String getRequest() {
        return backendAdapter.getRequests().getBody();
    }
}
