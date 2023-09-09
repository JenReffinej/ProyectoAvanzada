package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Medicamento implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idMedicamento;

    private String nombreMedicamento, dosis;
    private Integer cantidadMedicamentos;

    @ManyToOne
    private OrdenMedica ordenMedica;
}
