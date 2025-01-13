package prueba.reserva.infrastructure.dao.horarioreserva;

import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.domain.HorarioReserva;

import java.util.List;
import java.util.Optional;

public interface HorarioReservaDao {

    HorarioReserva save(HorarioReserva horarioReserva);
    Optional<HorarioReserva> findById(Integer idHorarioReserva);
    List<HorarioReserva> findAll();
    void deleteById(Integer idHorarioReserva);

}
