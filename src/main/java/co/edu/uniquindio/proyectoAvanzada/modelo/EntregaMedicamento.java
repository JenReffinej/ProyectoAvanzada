package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EntregaMedicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String direccionEntrega;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;
}
