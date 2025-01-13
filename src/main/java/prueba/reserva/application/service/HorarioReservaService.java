package prueba.reserva.application.service;

import prueba.reserva.domain.HorarioReserva;
import prueba.reserva.infrastructure.dto.HorarioReservaDTO;

import java.util.List;

public interface HorarioReservaService {

    HorarioReserva createHorarioReserva(HorarioReservaDTO horarioReservaDTO);
    HorarioReserva getHorarioReservaById(Integer idHorarioReserva);
    List<HorarioReserva> getAllHorariosReserva();
    HorarioReserva updateHorarioReserva(Integer idHorarioReserva, HorarioReservaDTO horarioReservaDTO);
    void deleteHorarioReserva(Integer idHorarioReserva);

}
