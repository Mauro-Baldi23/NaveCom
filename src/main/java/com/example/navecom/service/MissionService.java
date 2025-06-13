package com.example.navecom.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {

    private final KafkaTemplate<String, Long> kafkaTemplate;

    public void sendRotta(Long missionId) {
        kafkaTemplate.send("sc-topic", missionId);
    }

}
