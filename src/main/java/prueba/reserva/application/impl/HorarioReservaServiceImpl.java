package prueba.reserva.application.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prueba.reserva.application.service.HorarioReservaService;
import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.domain.HorarioReserva;
import prueba.reserva.infrastructure.dao.horariodisponible.HorarioDisponibleDao;
import prueba.reserva.infrastructure.dao.horarioreserva.HorarioReservaDao;
import prueba.reserva.infrastructure.dto.HorarioReservaDTO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HorarioReservaServiceImpl implements HorarioReservaService {

    private final HorarioReservaDao horarioReservaDao;
    private final HorarioDisponibleDao horarioDisponibleDao;

    @Override
    public HorarioReserva createHorarioReserva(HorarioReservaDTO horarioReservaDTO) {
        // Manejar Optional para horarioDisponible
        HorarioDisponible horarioDisponible = horarioDisponibleDao.findById(horarioReservaDTO.getIdHorarioDisponible())
                .orElseThrow(() -> new RuntimeException("Horario disponible no encontrado con id: " + horarioReservaDTO.getIdHorarioDisponible()));

        HorarioReserva horarioReserva = HorarioReserva.builder()
                .horarioDisponible(horarioDisponible)
                .estado(horarioReservaDTO.getEstado())
                .build();

        return horarioReservaDao.save(horarioReserva);
    }

    @Override
    public HorarioReserva getHorarioReservaById(Integer idHorarioReserva) {
        // Manejar Optional para horarioReserva
        return horarioReservaDao.findById(idHorarioReserva)
                .orElseThrow(() -> new RuntimeException("Horario reserva no encontrado con id: " + idHorarioReserva));
    }

    @Override
    public List<HorarioReserva> getAllHorariosReserva() {
        return horarioReservaDao.findAll();
    }

    @Override
    public HorarioReserva updateHorarioReserva(Integer idHorarioReserva, HorarioReservaDTO horarioReservaDTO) {
        // Manejar Optional para horarioReserva y horarioDisponible
        HorarioReserva horarioReserva = horarioReservaDao.findById(idHorarioReserva)
                .orElseThrow(() -> new RuntimeException("Horario reserva no encontrado con id: " + idHorarioReserva));

        HorarioDisponible horarioDisponible = horarioDisponibleDao.findById(horarioReservaDTO.getIdHorarioDisponible())
                .orElseThrow(() -> new RuntimeException("Horario disponible no encontrado con id: " + horarioReservaDTO.getIdHorarioDisponible()));

        horarioReserva.setHorarioDisponible(horarioDisponible);
        horarioReserva.setEstado(horarioReservaDTO.getEstado());

        return horarioReservaDao.save(horarioReserva);
    }

    @Override
    public void deleteHorarioReserva(Integer idHorarioReserva) {
        horarioReservaDao.deleteById(idHorarioReserva);
    }
}