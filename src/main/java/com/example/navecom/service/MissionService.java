package com.example.navecom.service;

import com.example.navecom.dto.FuelStationDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {

    String fscTopic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendFSC(FuelStationDTO dto) {
        kafkaTemplate.send(fscTopic, dto);
    }


}

