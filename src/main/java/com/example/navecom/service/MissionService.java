package com.example.navecom.service;

import com.example.navecom.payload.request.FuelStationRequest;
import com.example.navecom.payload.response.FuelStationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MissionService {

    private final KafkaTemplate<String, Long> kafkaTemplateLong;
    private final KafkaTemplate<String, Object> kafkaTemplateObject;

    public void sendMissionId(Long missionId) {
        kafkaTemplateLong.send("cl-topic", missionId);

    }

    public void sendFSC(FuelStationResponse response) {
        kafkaTemplateObject.send("fsc-topic", response);
    }


    public void sendRotta(Long missionId) {
        kafkaTemplateLong.send("sc-topic", missionId);
    }

}
