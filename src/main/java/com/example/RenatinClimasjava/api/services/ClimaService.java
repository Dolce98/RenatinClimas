package com.example.RenatinClimasjava.api.services;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.domain.RqClimaDto;
import com.example.RenatinClimasjava.api.factories.AdvisorClimaTempoFactory;
import com.example.RenatinClimasjava.api.factories.HgBrasilFactory;
import com.example.RenatinClimasjava.api.factories.OpenMeteoFactory;
import com.example.RenatinClimasjava.api.factories.WeatherApiFactory;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


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

    public List<ClimaDto> GetClimas(RqClimaDto rqClimaDto)  {
        List<ClimaDto> retorno = new ArrayList<>();
        try {
        ExecutorService ex = Executors.newCachedThreadPool();
        var ListCallables = new ArrayList<Callable<ClimaDto>>();

        for (var factory: factories) {
            ListCallables.add(() -> factory.GetClima(rqClimaDto));
        }


            var furure = ex.invokeAll(ListCallables);
            for (var f: furure) {
                retorno.add(f.get());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return retorno;
    }
}
