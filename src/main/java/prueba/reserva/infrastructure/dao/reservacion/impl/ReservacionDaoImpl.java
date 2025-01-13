package prueba.reserva.infrastructure.dao.reservacion.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import prueba.reserva.domain.Reservacion;
import prueba.reserva.infrastructure.dao.reservacion.ReservacionDao;
import prueba.reserva.infrastructure.dao.reservacion.ReservacionRepository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReservacionDaoImpl implements ReservacionDao {

    @Autowired
    private ReservacionRepository reservacionRepository;

    @Override
    public Reservacion save(Reservacion reservacion) {
        return reservacionRepository.save(reservacion);
    }

    @Override
    public List<Reservacion> findByFechaReserva(LocalDate fechaReserva) {
        return reservacionRepository.findByFechaReserva(fechaReserva);
    }

    @Override
    public Reservacion findById(Integer id) {
        return reservacionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        reservacionRepository.deleteById(id);
    }
}
