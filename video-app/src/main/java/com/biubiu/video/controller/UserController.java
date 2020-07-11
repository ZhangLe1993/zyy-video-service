package com.biubiu.video.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    public ResponseEntity<?> getCurrentUser() {
        Map<String, Object> map = new HashMap<>();
        map.put("", "");
        return new ResponseEntity<>(map,  HttpStatus.OK);
    }
}
