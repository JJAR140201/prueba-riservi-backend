package prueba.reserva.infrastructure.dao.horariodisponible;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.reserva.domain.HorarioDisponible;

public interface HorarioDisponibleRepository extends JpaRepository<HorarioDisponible, Integer> {
}
