package prueba.reserva.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservacionDTO {
    private Integer idReservacion;
    private Integer idCliente;
    private Integer idHorarioReserva;
    private LocalDate fechaReserva;
}
