package com.gatos.gato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gatos.gato.model.GatoModel;
import com.gatos.gato.service.GatoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/* 
 * Clase GatoController
 * Controlador REST para manejar las operaciones relacionadas con los gatos
 * Contiene métodos para crear, leer, actualizar y eliminar gatos
 * @RestController indica que esta clase es un controlador REST
 * @RequestMapping define la ruta base para las solicitudes HTTP
 */
@RestController
@RequestMapping("/api/v1/gatos")
public class GatoController {

    // Anotación @Autowired para inyectar el servicio de gatos
    @Autowired
    private GatoService gatoService;
    // Aquí puedes agregar métodos para manejar las solicitudes HTTP

    /* 
     * Método para crear un nuevo gato
     * @param gato El objeto GatoModel que se va a crear
     * @return El objeto GatoModel creado 
     */
    // Anotación @PostMapping indica que este método maneja solicitudes POST
    @PostMapping
    public GatoModel crearGato(@RequestBody GatoModel gato) {
        return gatoService.guardarGato(gato);
    }

}
