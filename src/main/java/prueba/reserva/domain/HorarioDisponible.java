package prueba.reserva.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Horarios_Disponibles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioDisponible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHorario;

    @Column(nullable = false)
    private String horaInicio;

    @Column(nullable = false)
    private String horaFin;
}
