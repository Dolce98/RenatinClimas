package com.example.RenatinClimasjava.api.controller;

import com.example.RenatinClimasjava.api.domain.ClimaDto;
import com.example.RenatinClimasjava.api.services.ClimaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clima")
public class ClimaController {
    private final ClimaService ClimaService = new ClimaService();

    @GetMapping()
    public ResponseEntity<List<ClimaDto>> GetClima(){
        return ResponseEntity.ok(ClimaService.GetClimas());
    }

}
