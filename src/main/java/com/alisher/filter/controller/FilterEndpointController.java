package com.alisher.filter.controller;

import com.alisher.filter.adapter.FilterBackendAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/filter")
public class FilterEndpointController {
    private final String CLEAN_OBSCENE_WORD_URL = "/clean";
    private final FilterBackendAdapter filterBackendAdapter;

    @GetMapping(CLEAN_OBSCENE_WORD_URL)
    public String getRequest(@RequestParam String word) {
        return filterBackendAdapter.cleanObscene(word).getBody();
    }
}
