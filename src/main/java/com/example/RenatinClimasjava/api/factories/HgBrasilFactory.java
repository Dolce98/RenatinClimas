package com.example.RenatinClimasjava.api.factories;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.dto.ClimaHgBrasilDto;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;
import com.example.RenatinClimasjava.api.services.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
public class HgBrasilFactory implements IClimaFactory<ClimaHgBrasilDto> {
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public ClimaDto GetClima() {
        try {
            String url = "https://api.hgbrasil.com/weather?array_limit=2&fields=only_results,temp,city_name&key=";
            String key = "8aa87758";

            String result = RequestService.Get(url + key);
            ClimaHgBrasilDto resultObj = MapperJson(result);
            return Mapper(resultObj);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ClimaHgBrasilDto MapperJson(String json) throws JsonProcessingException {
        return mapper.readValue(json, ClimaHgBrasilDto.class);
    }
    @Override
    public ClimaDto Mapper(ClimaHgBrasilDto resultObj) throws JsonProcessingException {
        ClimaDto clima = new ClimaDto();
        clima.Temperatura = resultObj.Temp;
        clima.Cidade = resultObj.CityName;
        return clima;
    }


}
