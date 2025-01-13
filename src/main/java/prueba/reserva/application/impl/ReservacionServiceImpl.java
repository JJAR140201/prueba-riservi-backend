package prueba.reserva.application.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.reserva.application.service.ReservacionService;
import prueba.reserva.domain.Cliente;
import prueba.reserva.domain.HorarioReserva;
import prueba.reserva.domain.Reservacion;
import prueba.reserva.infrastructure.dao.cliente.ClienteDao;
import prueba.reserva.infrastructure.dao.horarioreserva.HorarioReservaDao;
import prueba.reserva.infrastructure.dao.reservacion.ReservacionDao;
import prueba.reserva.infrastructure.dto.ReservacionDTO;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservacionServiceImpl implements ReservacionService {

    @Autowired
    private ReservacionDao reservacionDAO;

    @Autowired
    private ClienteDao clienteDao;

    @Autowired
    private HorarioReservaDao horarioReservaDao;

    @Override
    public Reservacion createReservacion(ReservacionDTO reservacionDTO) {
        // Verificar si el cliente existe
        Cliente cliente = clienteDao.findById(reservacionDTO.getIdCliente())
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        // Verificar si el horario existe
        HorarioReserva horarioReserva = horarioReservaDao.findById(reservacionDTO.getIdHorarioReserva())
                .orElseThrow(() -> new RuntimeException("Horario no encontrado"));

        // Crear la reservación con las entidades asociadas existentes
        Reservacion reservacion = Reservacion.builder()
                .cliente(cliente) // Cliente previamente persistido
                .horarioReserva(horarioReserva) // Horario previamente persistido
                .fechaReserva(reservacionDTO.getFechaReserva())
                .build();

        return reservacionDAO.save(reservacion);
    }

    @Override
    public List<Reservacion> getReservacionesPorFecha(LocalDate fecha) {
        return reservacionDAO.findByFechaReserva(fecha);
    }

    @Override
    public Reservacion updateReservacion(Integer id, ReservacionDTO reservacionDTO) {
        Reservacion reservacion = reservacionDAO.findById(id);
        reservacion.setFechaReserva(reservacionDTO.getFechaReserva());
        return reservacionDAO.save(reservacion);
    }

    @Override
    public void deleteReservacion(Integer id) {
        reservacionDAO.deleteById(id);
    }
}
