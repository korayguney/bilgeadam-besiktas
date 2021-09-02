package com.bilgeadam.restclient.controller;

import com.bilgeadam.restclient.model.ProcessStartTime;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Controller
@RequestMapping("/api")
public class TemplateController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/getSystemRunningTime")
    public String getSystemRunningTime(Model theModel) throws JsonProcessingException {
        ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:8080/actuator/metrics/process.start.time", String.class);

        ObjectMapper mapper = new ObjectMapper();
        ProcessStartTime processStartTime = mapper.readValue(result.getBody(), ProcessStartTime.class);
        long systemRunningTime = processStartTime.getMeasurements().get(0).getValue();
        LocalDateTime date = Instant.ofEpochSecond(systemRunningTime).atZone(ZoneId.systemDefault()).toLocalDateTime();
        theModel.addAttribute("systemrunning", date);
        return "systemtime";
    }


}
