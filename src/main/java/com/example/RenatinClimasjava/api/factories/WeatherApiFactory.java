package com.example.RenatinClimasjava.api.factories;

import java.io.IOException;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.dto.ClimaOpenMeteoDto;
import com.example.RenatinClimasjava.api.dto.ClimaWeatherApiDto;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;
import com.example.RenatinClimasjava.api.services.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherApiFactory implements IClimaFactory<ClimaWeatherApiDto>{
	String Url = "https://api.weatherapi.com/v1/current.json?key=d4c199e38e6842728bb221825230311&q=sao-paulo-sao-paulo-brazil&aqi=no";
	private final ObjectMapper mapper = new ObjectMapper();
	@Override
	public ClimaDto GetClima() {
		try {
			String result = RequestService.Get(Url);
			ClimaWeatherApiDto resultObj = MapperJson(result);
			return Mapper(resultObj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ClimaWeatherApiDto MapperJson(String json) throws JsonProcessingException {
		return mapper.readValue(json, ClimaWeatherApiDto.class);
	}

	@Override
	public ClimaDto Mapper(ClimaWeatherApiDto resultObj) throws JsonProcessingException {
		var clima = new ClimaDto();
		clima.Service = "WeatherApi";
		clima.Temperatura = resultObj.current.temp_c;
		clima.Cidade = resultObj.location.name;
		return clima;
	}

}
