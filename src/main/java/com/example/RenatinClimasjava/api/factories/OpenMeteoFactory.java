package com.example.RenatinClimasjava.api.factories;

import java.io.IOException;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.domain.RqClimaDto;
import com.example.RenatinClimasjava.api.dto.ClimaHgBrasilDto;
import com.example.RenatinClimasjava.api.dto.ClimaOpenMeteoDto;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;
import com.example.RenatinClimasjava.api.services.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OpenMeteoFactory implements IClimaFactory<ClimaOpenMeteoDto> {

	String Url = "https://api.open-meteo.com/v1/forecast?latitude=%latitude%&longitude=%longitude%&current=temperature_2m,relative_humidity_2m,precipitation,rain";
	private final ObjectMapper mapper = new ObjectMapper();
	@Override
	public ClimaDto GetClima(RqClimaDto rqClimaDto) {
		try {
			String result = RequestService.Get(Url.replace("%latitude%", rqClimaDto.Latitude).replace("%longitude%",rqClimaDto.Longitude));
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
		clima.Humidade = resultObj.current.relative_humidity_2m;
		clima.Precipitacao = resultObj.current.precipitation;
		return clima;
	}

}
