package com.gatos.gato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gatos.gato.model.GatoModel;

@Repository
public interface RepositoryGato extends JpaRepository<GatoModel, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, puedes buscar gatos por nombre o raza

    // Método para buscar un gato por su nombre
    GatoModel findByNombre(String nombre);

    @Query("INSERT INTO GatoModel (raza, nombre, edad, color, sexo) VALUES (:raza, :nombre, :edad, :color, :sexo)")
    GatoModel crearGato(String raza, String nombre, String edad, String color, String sexo);
}
