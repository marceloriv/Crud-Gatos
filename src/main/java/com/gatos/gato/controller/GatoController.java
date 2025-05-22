package com.gatos.gato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gatos.gato.model.GatoModel;
import com.gatos.gato.service.GatoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/gatos")
public class GatoController {

    @Autowired
    private GatoService gatoService;

    @PostMapping
    public GatoModel crearGato(@RequestBody GatoModel gato) {
        return gatoService.guardarGato(gato);
    }

}
