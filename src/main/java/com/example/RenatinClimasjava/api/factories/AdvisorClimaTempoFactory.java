package com.example.RenatinClimasjava.api.factories;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.dto.ClimaAdvisorDto;
import com.example.RenatinClimasjava.api.dto.ClimaHgBrasilDto;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;
import com.example.RenatinClimasjava.api.services.RequestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class AdvisorClimaTempoFactory implements IClimaFactory<ClimaAdvisorDto> {

    public String Url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=";
    public String Key = "f1a38c36f0fa60f34b918e5bc8807440";
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    public ClimaDto GetClima() {
        try {
            String result = RequestService.Get(Url+Key);
            ClimaAdvisorDto resultObj = MapperJson(result);
            return Mapper(resultObj);
        }
        catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public ClimaAdvisorDto MapperJson(String json) throws JsonProcessingException {
        return mapper.readValue(json, ClimaAdvisorDto.class);
    }
    @Override
    public ClimaDto Mapper(ClimaAdvisorDto resultObj) throws JsonProcessingException {
        ClimaDto clima = new ClimaDto();
        clima.Service = "AdvisorClimaTempo";
        clima.Temperatura = resultObj.data.temperature;
        clima.Cidade = resultObj.name;
        return clima;
    }
}
