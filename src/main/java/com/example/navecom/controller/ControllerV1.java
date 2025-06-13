package com.example.navecom.controller;

import com.example.navecom.dto.FuelStationDTO;
import com.example.navecom.service.MissionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Controller
@RequestMapping("/navecom")
public class ControllerV1 {

    private final MissionService missionService;

    @PostMapping("/update-mission/{missionId}")
    public ResponseEntity<String> updateMission(@PathVariable Long missionId) {
        missionService.sendMissionId(missionId);
        return ResponseEntity.ok("Mission ID sent: " + missionId);
    }


    @GetMapping("/checkRotta/{missionId}")
    public ResponseEntity<String> checkRotta(@RequestParam long missionId) {
        missionService.sendRotta(missionId);
        return ResponseEntity.ok("Rotta inviata: " + missionId);


    @GetMapping("/fscontrol")
    public void getFSControl(FuelStationDTO dto) {
        missionService.sendFSC(dto);
    }
}
