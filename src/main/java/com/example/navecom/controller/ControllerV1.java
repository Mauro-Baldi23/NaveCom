package com.example.navecom.controller;

import com.example.navecom.dto.FuelStationDTO;
import com.example.navecom.service.MissionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/navecom")
public class ControllerV1 {

    private MissionService missionService;

    @GetMapping("/fscontrol")
    public void getFSControl(FuelStationDTO dto) {
        missionService.sendFSC(dto);
    }
}
