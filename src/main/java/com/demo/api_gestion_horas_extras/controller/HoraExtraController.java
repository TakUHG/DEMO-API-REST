package com.demo.api_gestion_horas_extras.controller;


import com.demo.api_gestion_horas_extras.model.HoraExtra; // Importa la entidad HoraExtra
import com.demo.api_gestion_horas_extras.service.HoraExtraService; // Importa el servicio HoraExtraService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horas-extras")
public class HoraExtraController {

    @Autowired
    private HoraExtraService service;

    @GetMapping
    public List<HoraExtra> listarHorasExtras() {
        return service.obtenerHorasExtras();
    }

    @PostMapping
    public HoraExtra registrarHoraExtra(@RequestBody HoraExtra horaExtra) {
        return service.registrarHoraExtra(horaExtra);
    }
}
