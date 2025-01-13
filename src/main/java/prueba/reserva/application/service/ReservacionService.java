package prueba.reserva.application.service;

import prueba.reserva.domain.Reservacion;
import prueba.reserva.infrastructure.dto.ReservacionDTO;

import java.time.LocalDate;
import java.util.List;

public interface ReservacionService {

    Reservacion createReservacion(ReservacionDTO reservacionDTO);
    List<Reservacion> getReservacionesPorFecha(LocalDate fecha);
    Reservacion updateReservacion(Integer id, ReservacionDTO reservacionDTO);
    void deleteReservacion(Integer id);

}
