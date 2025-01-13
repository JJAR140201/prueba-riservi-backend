package prueba.reserva.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import prueba.reserva.domain.HorarioReserva.Estado;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioReservaDTO {

    private Integer idHorarioReserva;
    private Integer idHorarioDisponible; // ID del horario relacionado
    private Estado estado;

}
