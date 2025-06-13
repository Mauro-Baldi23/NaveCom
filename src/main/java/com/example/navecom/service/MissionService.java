package com.example.navecom.service;

public class MissionService {

    private final KafkaTemplate<String, Long> kafkaTemplate;
    String fscTopic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMissionId(Long missionId) {
        kafkaTemplate.send("cl-topic", missionId);
        }

    public void sendFSC(FuelStationDTO dto) {
        kafkaTemplate.send(fscTopic, dto);
    }


    private final KafkaTemplate<String, Long> kafkaTemplate;

    public void sendRotta(Long missionId) {
        kafkaTemplate.send("sc-topic", missionId);
    }

}
