package prueba.reserva.application.service;

import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.infrastructure.dto.HorarioDisponibleDTO;

import java.util.List;

public interface HorarioDisponibleService {

    HorarioDisponible createHorario(HorarioDisponibleDTO horarioDisponibleDTO);
    HorarioDisponible getHorarioById(Integer idHorario);
    List<HorarioDisponible> getAllHorarios();
    HorarioDisponible updateHorario(Integer idHorario, HorarioDisponibleDTO horarioDisponibleDTO);
    void deleteHorario(Integer idHorario);

}
