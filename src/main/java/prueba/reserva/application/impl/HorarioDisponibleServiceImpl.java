package prueba.reserva.application.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prueba.reserva.application.service.HorarioDisponibleService;
import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.infrastructure.dao.horariodisponible.HorarioDisponibleDao;
import prueba.reserva.infrastructure.dto.HorarioDisponibleDTO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HorarioDisponibleServiceImpl implements HorarioDisponibleService {

    private final HorarioDisponibleDao horarioDisponibleDao;

    @Override
    public HorarioDisponible createHorario(HorarioDisponibleDTO horarioDisponibleDTO) {
        HorarioDisponible horarioDisponible = HorarioDisponible.builder()
                .horaInicio(horarioDisponibleDTO.getHoraInicio())
                .horaFin(horarioDisponibleDTO.getHoraFin())
                .build();
        return horarioDisponibleDao.save(horarioDisponible);
    }

    @Override
    public HorarioDisponible getHorarioById(Integer idHorario) {
        // Manejar Optional con orElseThrow
        return horarioDisponibleDao.findById(idHorario)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado con id: " + idHorario));
    }

    @Override
    public List<HorarioDisponible> getAllHorarios() {
        return horarioDisponibleDao.findAll();
    }

    @Override
    public HorarioDisponible updateHorario(Integer idHorario, HorarioDisponibleDTO horarioDisponibleDTO) {
        // Manejar Optional con orElseThrow
        HorarioDisponible horarioDisponible = horarioDisponibleDao.findById(idHorario)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado con id: " + idHorario));

        horarioDisponible.setHoraInicio(horarioDisponibleDTO.getHoraInicio());
        horarioDisponible.setHoraFin(horarioDisponibleDTO.getHoraFin());

        return horarioDisponibleDao.save(horarioDisponible);
    }

    @Override
    public void deleteHorario(Integer idHorario) {
        // Verificar si existe antes de eliminar
        horarioDisponibleDao.findById(idHorario)
                .orElseThrow(() -> new RuntimeException("Horario no encontrado con id: " + idHorario));

        horarioDisponibleDao.deleteById(idHorario);
    }
}