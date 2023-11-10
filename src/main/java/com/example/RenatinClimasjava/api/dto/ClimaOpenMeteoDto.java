package com.example.RenatinClimasjava.api.dto;
import java.util.ArrayList;

public class ClimaOpenMeteoDto{
    public double latitude;
    public double longitude;
    public double generationtime_ms;
    public int utc_offset_seconds;
    public String timezone;
    public String timezone_abbreviation;
    public double elevation;
    public CurrentUnits current_units;
    public Current current;
    public HourlyUnits hourly_units;
    public Hourly hourly;
    
    public class Current{
        public String time;
        public int interval;
        public float temperature_2m;
    }

    public class CurrentUnits{
        public String time;
        public String interval;
        public String temperature_2m;
    }

    public class Hourly{
        public ArrayList<String> time;
        public ArrayList<Object> temperature_2m;
    }

    public class HourlyUnits{
        public String time;
        public String temperature_2m;
    }
}

