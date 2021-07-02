package com.alisher.filter.adapter;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "message-filter", url = "${backend.url}/filter")
public interface FilterBackendAdapter {

    @GetMapping(value = "/clean")
    public ResponseEntity<String> cleanObscene(@RequestParam String word);
}
