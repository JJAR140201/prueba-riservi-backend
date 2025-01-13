package prueba.reserva.infrastructure.dao.horariodisponible.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.infrastructure.dao.horariodisponible.HorarioDisponibleDao;
import prueba.reserva.infrastructure.dao.horariodisponible.HorarioDisponibleRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class HorarioDisponibleDaoImpl implements HorarioDisponibleDao {

    private final HorarioDisponibleRepository horarioDisponibleRepository;

    @Override
    public HorarioDisponible save(HorarioDisponible horarioDisponible) {
        return horarioDisponibleRepository.save(horarioDisponible);
    }

    @Override
    public Optional<HorarioDisponible> findById(Integer idHorario) {
        return horarioDisponibleRepository.findById(idHorario);
    }

    @Override
    public List<HorarioDisponible> findAll() {
        return horarioDisponibleRepository.findAll();
    }

    @Override
    public void deleteById(Integer idHorario) {
        horarioDisponibleRepository.deleteById(idHorario);
    }

}
