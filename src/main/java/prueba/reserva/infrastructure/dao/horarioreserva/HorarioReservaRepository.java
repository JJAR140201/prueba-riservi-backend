package prueba.reserva.infrastructure.dao.horarioreserva;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.reserva.domain.HorarioReserva;

public interface HorarioReservaRepository extends JpaRepository<HorarioReserva, Integer> {
}
