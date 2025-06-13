package com.example.navecom.service;

import com.example.navecom.payload.request.FuelStationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {

    private final KafkaTemplate<String, Long> kafkaTemplateLong;
    private final KafkaTemplate<String, Object> kafkaTemplateObject;

    String fscTopic;


    public void sendMissionId(Long missionId) {
        kafkaTemplateLong.send("cl-topic", missionId);

    }


    public void sendFSC(FuelStationRequest dto) {
        kafkaTemplateObject.send("fsc-topic", dto);
    }


    public void sendRotta(Long missionId) {
        kafkaTemplateLong.send("sc-topic", missionId);
    }

}
