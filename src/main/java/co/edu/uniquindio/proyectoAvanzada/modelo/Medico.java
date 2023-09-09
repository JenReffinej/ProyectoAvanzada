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
public class Medico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idMedico;

    private String emailMedico, contraseniaMedico, nombreMedico, apellidoMedico,
            ciudadMedico, especilidad;
    private Integer telefonoMedico;
    private String fotoMedico;
    private LocalDateTime diaLibre, horaEntrada, horaSalida;

    //declaracion de la variable para relacionar de 1 a muchos, el mapped by va en nombre de la otra tabla en minuscula
    // donde este la llave foranea dentro del UML  va el mapped by
    @OneToMany(mappedBy = "medico")
    private List<Horario> horarios;

   // mapped by va en la tabla no dependiente
    @OneToMany(mappedBy = "medico")
    private List<Cita> citas;

    @OneToMany(mappedBy = "medico")
    private List<EntregaMedicamento> entregaMedicamentos;
}
