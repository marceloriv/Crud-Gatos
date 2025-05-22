package com.gatos.gato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gatos.gato.model.GatoModel;

@Repository
public interface RepositoryGato extends JpaRepository<GatoModel, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, puedes buscar gatos por nombre o raza

    GatoModel findByNombre(String nombre);
}
