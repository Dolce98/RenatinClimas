package com.example.RenatinClimasjava.api.factories;

import java.io.IOException;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.dto.ClimaHgBrasilDto;
import com.example.RenatinClimasjava.api.dto.ClimaOpenMeteoDto;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;
import com.example.RenatinClimasjava.api.services.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OpenMeteoFactory implements IClimaFactory<ClimaOpenMeteoDto> {

	String Url = "https://api.open-meteo.com/v1/forecast?latitude=-23.5475&longitude=-46.6361&current=temperature_2m&hourly=temperature_2m&timezone=America%2FSao_Paulo&forecast_days=1";
	private final ObjectMapper mapper = new ObjectMapper();
	@Override
	public ClimaDto GetClima() {
		try {
			String result = RequestService.Get(Url);
			ClimaOpenMeteoDto resultObj = MapperJson(result);
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
	public ClimaOpenMeteoDto MapperJson(String json) throws JsonProcessingException {
		 return mapper.readValue(json, ClimaOpenMeteoDto.class);
	}

	@Override
	public ClimaDto Mapper(ClimaOpenMeteoDto resultObj) throws JsonProcessingException {
		var clima = new ClimaDto();
		clima.Service = "Open-Meteo";
		clima.Temperatura = resultObj.current.temperature_2m;
		clima.Cidade = resultObj.timezone;
		return clima;
	}

}
