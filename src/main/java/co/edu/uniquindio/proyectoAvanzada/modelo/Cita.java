package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Cita implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idCita;

    private LocalDateTime horaCita, fechaCreacion;
    private String motivoConsulta;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    @OneToMany(mappedBy = "citas")
    private List<OrdenMedica> ordenMedicas;


}
