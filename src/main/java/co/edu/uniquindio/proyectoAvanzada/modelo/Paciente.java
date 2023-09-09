package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Paciente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idPaciente;

    private String emaiPaciente, contraseniaPaciente, nombrePaciente, apellidoPaciente, ciudadPaciente, tipoSangre, EPSPaciente;
    private LocalDateTime fecheNacimiento;
    private Integer telefonoPaciente;
    private String fotoPaciente;

    @OneToMany(mappedBy = "paciente")
    private List<Cita> citas;

    @OneToMany(mappedBy = "paciente")
    private List<EntregaMedicamento> entregaMedicamentos;


}
