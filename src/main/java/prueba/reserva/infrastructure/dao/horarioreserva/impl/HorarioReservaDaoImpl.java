package prueba.reserva.infrastructure.dao.horarioreserva.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import prueba.reserva.domain.HorarioReserva;
import prueba.reserva.infrastructure.dao.horarioreserva.HorarioReservaDao;
import prueba.reserva.infrastructure.dao.horarioreserva.HorarioReservaRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class HorarioReservaDaoImpl implements HorarioReservaDao {

    private final HorarioReservaRepository horarioReservaRepository;

    @Override
    public HorarioReserva save(HorarioReserva horarioReserva) {
        return horarioReservaRepository.save(horarioReserva);
    }

    @Override
    public Optional<HorarioReserva> findById(Integer idHorarioReserva) {
        return horarioReservaRepository.findById(idHorarioReserva);
    }

    @Override
    public List<HorarioReserva> findAll() {
        return horarioReservaRepository.findAll();
    }

    @Override
    public void deleteById(Integer idHorarioReserva) {
        horarioReservaRepository.deleteById(idHorarioReserva);
    }

}
