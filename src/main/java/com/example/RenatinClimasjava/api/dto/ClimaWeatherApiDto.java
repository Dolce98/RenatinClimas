package com.example.RenatinClimasjava.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClimaWeatherApiDto{
	
 @JsonProperty("location") 
 public Location getLocation() { 
		 return this.location; } 
 public void setLocation(Location location) { 
		 this.location = location; } 
 
 Location location;
 
 @JsonProperty("current") 
 public Current getCurrent() { 
		 return this.current; } 
 public void setCurrent(Current current) { 
		 this.current = current; } 
 
 Current current;
 
 
 public static class Condition{
	 @JsonProperty("text") 
	 public String getText() { 
			 return this.text; } 
	 public void setText(String text) { 
			 this.text = text; } 
	 String text;
	 @JsonProperty("icon") 
	 public String getIcon() { 
			 return this.icon; } 
	 public void setIcon(String icon) { 
			 this.icon = icon; } 
	 String icon;
	 @JsonProperty("code") 
	 public int getCode() { 
			 return this.code; } 
	 public void setCode(int code) { 
			 this.code = code; } 
	 int code;
	}

	public class Current{
	 @JsonProperty("last_updated_epoch") 
	 public int getLast_updated_epoch() { 
			 return this.last_updated_epoch; } 
	 public void setLast_updated_epoch(int last_updated_epoch) { 
			 this.last_updated_epoch = last_updated_epoch; } 
	 int last_updated_epoch;
	 @JsonProperty("last_updated") 
	 public String getLast_updated() { 
			 return this.last_updated; } 
	 public void setLast_updated(String last_updated) { 
			 this.last_updated = last_updated; } 
	 String last_updated;
	 @JsonProperty("temp_c") 
	 public double getTemp_c() { 
			 return this.temp_c; } 
	 public void setTemp_c(double temp_c) { 
			 this.temp_c = temp_c; } 
	 double temp_c;
	 @JsonProperty("temp_f") 
	 public double getTemp_f() { 
			 return this.temp_f; } 
	 public void setTemp_f(double temp_f) { 
			 this.temp_f = temp_f; } 
	 double temp_f;
	 @JsonProperty("is_day") 
	 public int getIs_day() { 
			 return this.is_day; } 
	 public void setIs_day(int is_day) { 
			 this.is_day = is_day; } 
	 int is_day;
	 @JsonProperty("condition") 
	 public Condition getCondition() { 
			 return this.condition; } 
	 public void setCondition(Condition condition) { 
			 this.condition = condition; } 
	 Condition condition;
	 @JsonProperty("wind_mph") 
	 public double getWind_mph() { 
			 return this.wind_mph; } 
	 public void setWind_mph(double wind_mph) { 
			 this.wind_mph = wind_mph; } 
	 double wind_mph;
	 @JsonProperty("wind_kph") 
	 public double getWind_kph() { 
			 return this.wind_kph; } 
	 public void setWind_kph(double wind_kph) { 
			 this.wind_kph = wind_kph; } 
	 double wind_kph;
	 @JsonProperty("wind_degree") 
	 public int getWind_degree() { 
			 return this.wind_degree; } 
	 public void setWind_degree(int wind_degree) { 
			 this.wind_degree = wind_degree; } 
	 int wind_degree;
	 @JsonProperty("wind_dir") 
	 public String getWind_dir() { 
			 return this.wind_dir; } 
	 public void setWind_dir(String wind_dir) { 
			 this.wind_dir = wind_dir; } 
	 String wind_dir;
	 @JsonProperty("pressure_mb") 
	 public double getPressure_mb() { 
			 return this.pressure_mb; } 
	 public void setPressure_mb(double pressure_mb) { 
			 this.pressure_mb = pressure_mb; } 
	 double pressure_mb;
	 @JsonProperty("pressure_in") 
	 public double getPressure_in() { 
			 return this.pressure_in; } 
	 public void setPressure_in(double pressure_in) { 
			 this.pressure_in = pressure_in; } 
	 double pressure_in;
	 @JsonProperty("precip_mm") 
	 public double getPrecip_mm() { 
			 return this.precip_mm; } 
	 public void setPrecip_mm(double precip_mm) { 
			 this.precip_mm = precip_mm; } 
	 double precip_mm;
	 @JsonProperty("precip_in") 
	 public double getPrecip_in() { 
			 return this.precip_in; } 
	 public void setPrecip_in(double precip_in) { 
			 this.precip_in = precip_in; } 
	 double precip_in;
	 @JsonProperty("humidity") 
	 public int getHumidity() { 
			 return this.humidity; } 
	 public void setHumidity(int humidity) { 
			 this.humidity = humidity; } 
	 int humidity;
	 @JsonProperty("cloud") 
	 public int getCloud() { 
			 return this.cloud; } 
	 public void setCloud(int cloud) { 
			 this.cloud = cloud; } 
	 int cloud;
	 @JsonProperty("feelslike_c") 
	 public double getFeelslike_c() { 
			 return this.feelslike_c; } 
	 public void setFeelslike_c(double feelslike_c) { 
			 this.feelslike_c = feelslike_c; } 
	 double feelslike_c;
	 @JsonProperty("feelslike_f") 
	 public double getFeelslike_f() { 
			 return this.feelslike_f; } 
	 public void setFeelslike_f(double feelslike_f) { 
			 this.feelslike_f = feelslike_f; } 
	 double feelslike_f;
	 @JsonProperty("vis_km") 
	 public double getVis_km() { 
			 return this.vis_km; } 
	 public void setVis_km(double vis_km) { 
			 this.vis_km = vis_km; } 
	 double vis_km;
	 @JsonProperty("vis_miles") 
	 public double getVis_miles() { 
			 return this.vis_miles; } 
	 public void setVis_miles(double vis_miles) { 
			 this.vis_miles = vis_miles; } 
	 double vis_miles;
	 @JsonProperty("uv") 
	 public double getUv() { 
			 return this.uv; } 
	 public void setUv(double uv) { 
			 this.uv = uv; } 
	 double uv;
	 @JsonProperty("gust_mph") 
	 public double getGust_mph() { 
			 return this.gust_mph; } 
	 public void setGust_mph(double gust_mph) { 
			 this.gust_mph = gust_mph; } 
	 double gust_mph;
	 @JsonProperty("gust_kph") 
	 public double getGust_kph() { 
			 return this.gust_kph; } 
	 public void setGust_kph(double gust_kph) { 
			 this.gust_kph = gust_kph; } 
	 double gust_kph;
	}

	public class Location{
	 @JsonProperty("name") 
	 public String getName() { 
			 return this.name; } 
	 public void setName(String name) { 
			 this.name = name; } 
	 String name;
	 @JsonProperty("region") 
	 public String getRegion() { 
			 return this.region; } 
	 public void setRegion(String region) { 
			 this.region = region; } 
	 String region;
	 @JsonProperty("country") 
	 public String getCountry() { 
			 return this.country; } 
	 public void setCountry(String country) { 
			 this.country = country; } 
	 String country;
	 @JsonProperty("lat") 
	 public double getLat() { 
			 return this.lat; } 
	 public void setLat(double lat) { 
			 this.lat = lat; } 
	 double lat;
	 @JsonProperty("lon") 
	 public double getLon() { 
			 return this.lon; } 
	 public void setLon(double lon) { 
			 this.lon = lon; } 
	 double lon;
	 @JsonProperty("tz_id") 
	 public String getTz_id() { 
			 return this.tz_id; } 
	 public void setTz_id(String tz_id) { 
			 this.tz_id = tz_id; } 
	 String tz_id;
	 @JsonProperty("localtime_epoch") 
	 public int getLocaltime_epoch() { 
			 return this.localtime_epoch; } 
	 public void setLocaltime_epoch(int localtime_epoch) { 
			 this.localtime_epoch = localtime_epoch; } 
	 int localtime_epoch;
	 @JsonProperty("localtime") 
	 public String getLocaltime() { 
			 return this.localtime; } 
	 public void setLocaltime(String localtime) { 
			 this.localtime = localtime; } 
	 String localtime;
	}
}

