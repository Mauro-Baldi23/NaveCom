package com.example.navecom.payload.response;

import com.example.navecom.payload.request.FuelStationRequest;
import jakarta.validation.constraints.NotBlank;


public class FuelStationResponse {

    @NotBlank
    private String nomeNave;
    @NotBlank
    private String nomeRotta;

    public FuelStationResponse(FuelStationRequest request) {
        this.nomeNave = request.getNomeNave();
        this.nomeRotta = request.getNomeRotta();
    }
}
