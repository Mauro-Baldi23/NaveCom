package com.example.navecom.controller;

import com.example.navecom.payload.request.FuelStationRequest;
import com.example.navecom.payload.response.FuelStationResponse;
import com.example.navecom.service.MissionService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Controller
@RequestMapping("/navecom")
@Validated
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
    }

    @GetMapping("/fscontrol")
    public ResponseEntity<String> getFSControl(@Valid @RequestBody FuelStationRequest request) {
        FuelStationResponse response = new FuelStationResponse(request);
        missionService.sendFSC(response);
        return ResponseEntity.ok("Dati inviati");
    }
}
