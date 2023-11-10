package com.example.RenatinClimasjava.api.services;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.factories.AdvisorClimaTempoFactory;
import com.example.RenatinClimasjava.api.factories.HgBrasilFactory;
import com.example.RenatinClimasjava.api.factories.OpenMeteoFactory;
import com.example.RenatinClimasjava.api.factories.WeatherApiFactory;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ClimaService {
    List<IClimaFactory> factories = GetFactories();

    private List<IClimaFactory> GetFactories() {
        var retorno =  new ArrayList<IClimaFactory>();
        retorno.add(new AdvisorClimaTempoFactory());
        retorno.add(new HgBrasilFactory());
        retorno.add(new OpenMeteoFactory());
        retorno.add(new WeatherApiFactory());
        return retorno;
    }

    public List<ClimaDto> GetClimas(){
        List<ClimaDto> retorno = new ArrayList<ClimaDto>();

        for (var factory: factories) {
             retorno.add(factory.GetClima());
        }
        return retorno;
    }
}
