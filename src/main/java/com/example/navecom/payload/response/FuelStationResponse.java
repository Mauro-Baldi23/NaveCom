package com.example.navecom.payload.response;

import jakarta.validation.constraints.NotBlank;


public class FuelStationResponse {

    @NotBlank
    private String nomeNave;
    @NotBlank
    private String nomeRotta;

}
