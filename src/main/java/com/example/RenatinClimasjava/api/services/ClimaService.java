package com.example.RenatinClimasjava.api.services;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.factories.AdvisorClimaTempoFactory;
import com.example.RenatinClimasjava.api.factories.HgBrasilFactory;
import com.example.RenatinClimasjava.api.factories.Interface.IClimaFactory;

public class ClimaService {
    IClimaFactory factories = new AdvisorClimaTempoFactory();

    public ClimaDto GetClimas(){
        return factories.GetClima();
    }
}
