package prueba.reserva.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Horario_Reservas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioReserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHorarioReserva;

    @ManyToOne
    @JoinColumn(name = "id_horario", nullable = false)
    private HorarioDisponible horarioDisponible;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public enum Estado {
        disponible,
        reservado
    }
}
