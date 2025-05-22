package com.gatos.gato.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class GatoModel {

    /* 
     * Clase que representa un gato
     * Contiene atributos como id, nombre, edad y raza
     */
    // Atributo id que se genera automáticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre que no puede estar vacío  gracias a la anotación @NotBlank"" 
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    // Edad que no puede estar vacía y debe tener entre 5 y 20 caracteres
    @NotBlank(message = "La edad no puede estar vacía")
    @Size(min = 5, max = 20, message = "La edad debe tener entre 5 y 20 caracteres")
    private int edad;

    // Raza que no puede estar vacía
    @NotBlank(message = "La raza no puede estar vacía")
    private String raza;

}
