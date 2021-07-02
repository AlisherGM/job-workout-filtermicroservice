package com.alisher.filter.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class BackendAdapter {
    private static final String ROOT_URL = "/chat/test";
    private final RestTemplate restTemplate;

    @Value("${backend.url}")
    private String backendUrl;

    public ResponseEntity<String> getRequests() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8081/chat/test", String.class);
        return response;
    }
}
