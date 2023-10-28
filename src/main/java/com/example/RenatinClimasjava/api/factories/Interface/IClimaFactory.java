package com.example.RenatinClimasjava.api.factories.Interface;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface IClimaFactory<T> {
    ClimaDto GetClima();
    T MapperJson(String json) throws JsonProcessingException;
    ClimaDto Mapper(T resultObj) throws JsonProcessingException;
}
