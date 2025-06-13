package com.example.navecom.controller;


import com.example.navecom.service.MissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ControllerV1 {
    private final MissionService missionService;



    @GetMapping("/checkRotta/{missionId}")
    public ResponseEntity<String> checkRotta(@RequestParam long missionId) {
        missionService.sendRotta(missionId);
        return ResponseEntity.ok("Rotta inviata: " + missionId);

    }
}
