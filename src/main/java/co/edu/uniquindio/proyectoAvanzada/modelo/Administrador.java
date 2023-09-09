package co.edu.uniquindio.proyectoAvanzada.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Administrador implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int idAdministrador;

    private String emailAdministrador, contraseniaAdministrador;

    // mapped by va en la tabla no dependiente
    @OneToMany(mappedBy = "administrador")
    private List<MensajePQRS> mensajePqrsPQRS;


}
