package prueba.reserva.infrastructure.dao.horariodisponible;

import prueba.reserva.domain.HorarioDisponible;

import java.util.List;
import java.util.Optional;

public interface HorarioDisponibleDao {

    HorarioDisponible save(HorarioDisponible horarioDisponible);
    Optional<HorarioDisponible> findById(Integer idHorario);
    List<HorarioDisponible> findAll();
    void deleteById(Integer idHorario);

}
