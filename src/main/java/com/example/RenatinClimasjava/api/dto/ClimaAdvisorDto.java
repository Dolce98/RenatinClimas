package com.example.RenatinClimasjava.api.dto;

public class ClimaAdvisorDto {
    public int id;
    public String name;
    public String state;
    public String country;
    public Data data;
    public class Data{
        public Float temperature;
        public String wind_direction;
        public int wind_velocity;
        public int humidity;
        public String condition;
        public int pressure;
        public String icon;
        public int sensation;
        public String date;
    }

}
