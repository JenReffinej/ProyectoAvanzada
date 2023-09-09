package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class NotaMedica implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Integer idNotaMedica;

    private String descripcion;

}
