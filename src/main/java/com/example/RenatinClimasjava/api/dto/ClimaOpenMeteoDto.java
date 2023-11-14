package com.example.RenatinClimasjava.api.dto;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

//// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */


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
 
 public class Current{
	 public String time;
	 public int interval;
	 public double temperature_2m;
	 public int relative_humidity_2m;
	 public double precipitation;
	 public double rain;
	}

	public class CurrentUnits{
	 public String time;
	 public String interval;
	 public String temperature_2m;
	 public String relative_humidity_2m;
	 public String precipitation;
	 public String rain;
	}
}

