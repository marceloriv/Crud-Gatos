package com.gatos.gato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatos.gato.model.GatoModel;
import com.gatos.gato.repository.RepositoryGato;

@Service
public class GatoService {
    // Aquí puedes agregar la lógica de negocio relacionada con los gatos
    // Por ejemplo, métodos para crear, leer, actualizar y eliminar gatos
    // También puedes agregar validaciones adicionales si es necesario

    // Ejemplo de método para obtener todos los gatos
    // public List<GatoModel> obtenerTodosLosGatos() {
    //     return repositoryGato.findAll();
    // }
    // Ejemplo de método para guardar un gato
    // public GatoModel guardarGato(GatoModel gato) {
    //     return repositoryGato.save(gato);
    // }
    @Autowired
    private RepositoryGato repositoryGato;

    public GatoModel guardarGato(GatoModel gato) {

        //Instanciar un nuevo objeto GatoModel
        GatoModel gatoNuevo = new GatoModel();

        // Asignar los valores del gato recibido al nuevo objeto
        gatoNuevo.setNombre(gato.getNombre());
        gatoNuevo.setEdad(gato.getEdad());
        gatoNuevo.setRaza(gato.getRaza());

        // Guardar el nuevo gato en la base de datos
        return repositoryGato.save(gatoNuevo);

    }

    public GatoModel buscarPorNombre(String nombre) {
        return repositoryGato.findByNombre(nombre);
    }

}
