package com.biubiu.video.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/zyy/audio")
public class AudioController {

    @PostMapping(value = "/parse")
    public ResponseEntity<?> audioParse(String type, String input) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> resp = restTemplate.getForEntity("https://v.douyin.com/J8C4SrV/", String.class);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
