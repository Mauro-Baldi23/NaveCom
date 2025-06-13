package com.example.navecom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {

    private final KafkaTemplate<String, Long> kafkaTemplate;
    String fscTopic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMissionId(Long missionId) {
        kafkaTemplate.send("cl-topic", missionId);
    public void sendFSC(FuelStationDTO dto) {
        kafkaTemplate.send(fscTopic, dto);
    }


}
