package prueba.reserva.infrastructure.dao.reservacion;

import prueba.reserva.domain.Reservacion;

import java.time.LocalDate;
import java.util.List;

public interface ReservacionDao {
    Reservacion save(Reservacion reservacion);
    List<Reservacion> findByFechaReserva(LocalDate fechaReserva);
    Reservacion findById(Integer id);
    void deleteById(Integer id);
}
