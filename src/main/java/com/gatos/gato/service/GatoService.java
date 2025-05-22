package com.gatos.gato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatos.gato.model.GatoModel;
import com.gatos.gato.repository.RepositoryGato;

// Anotación @Service indica que esta clase es un servicio de Spring
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
    // Anotación @Autowired para inyectar el repositorio de gatos
    @Autowired
    private RepositoryGato repositoryGato;

    /* 
     * Método para guardar un gato
     * @param gato El objeto GatoModel que se va a guardar
     * @return El objeto GatoModel guardado
     * Este método crea un nuevo objeto GatoModel y lo guarda en la base de datos
     * utilizando el repositorio de gatos
     */
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

    // Método para buscar un gato por su nombre
    public GatoModel buscarPorNombre(String nombre) {
        return repositoryGato.findByNombre(nombre);
    }

}
