package prueba.reserva.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioDisponibleDTO {

    private Integer idHorario;
    private String horaInicio;
    private String horaFin;

}
