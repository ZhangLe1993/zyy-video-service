package com.biubiu.video.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("api/getUserInfo")
    public ResponseEntity<Map> getUserInfo(HttpServletRequest request) throws SQLException {
        Map<String, Object> userMap = new HashMap<>();
        String name = " 张宇乐";
        String uk = "105281";
        userMap.put("uk", uk);
        userMap.put("name", name);

        userMap.put("roles", new ArrayList<>(Arrays.asList("ROOT","ETL")));
        userMap.put("is_root", true);
        userMap.put("is_etl", true);
        userMap.put("hasLogin", 1);
        return new ResponseEntity<>(userMap, HttpStatus.OK);
    }
}
