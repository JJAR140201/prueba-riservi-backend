package prueba.reserva.infrastructure.dao.reservacion;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.reserva.domain.Reservacion;

import java.time.LocalDate;
import java.util.List;

public interface ReservacionRepository extends JpaRepository<Reservacion, Integer> {

    List<Reservacion> findByFechaReserva(LocalDate fechaReserva);

}
