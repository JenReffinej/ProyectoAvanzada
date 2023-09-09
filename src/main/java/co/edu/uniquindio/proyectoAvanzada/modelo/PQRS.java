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

public class PQRS implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Integer idPQRS;

    // mapped by va en la tabla no dependiente
    @OneToMany(mappedBy = "pqrs")
    private List<MensajePQRS> mensajePqrs;

}
