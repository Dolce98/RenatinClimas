package com.example.RenatinClimasjava.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClimaHgBrasilDto {
    @JsonProperty("temp")
    public Float Temp;
    @JsonProperty("city_name")
    public String CityName;
}
