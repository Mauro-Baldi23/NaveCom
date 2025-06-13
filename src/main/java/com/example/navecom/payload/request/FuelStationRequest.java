package com.example.navecom.payload.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FuelStationRequest {

    private String nomeNave;
    private String nomeRotta;

}
