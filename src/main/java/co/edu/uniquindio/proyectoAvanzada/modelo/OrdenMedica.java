package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class OrdenMedica implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idOrdenMedica;
    private String diagnostico, tratamiento, sintomasPaciente;

    @ManyToOne
    private Cita citas;

    // mapped by va en la tabla no dependiente
    @OneToMany(mappedBy = "ordenMedica")
    private List<Medicamento> medicamentos;

    // mapped by va en la tabla no dependiente
    @OneToMany(mappedBy = "ordenMedica")
    private List<AutorizacionMedicamento> autorizacionMedicamentos;

}
