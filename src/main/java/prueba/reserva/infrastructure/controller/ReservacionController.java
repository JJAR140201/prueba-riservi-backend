package prueba.reserva.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prueba.reserva.application.service.ReservacionService;
import prueba.reserva.domain.Reservacion;
import prueba.reserva.infrastructure.dto.ReservacionDTO;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/reservaciones")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ReservacionController {

    @Autowired
    private ReservacionService reservacionService;

    @PostMapping("/crear-reservacion")
    public ResponseEntity<Reservacion> crearReservacion(@RequestBody ReservacionDTO reservacionDTO) {
        if (reservacionDTO.getIdCliente() == null || reservacionDTO.getIdHorarioReserva() == null) {
            throw new IllegalArgumentException("Los IDs de cliente y horario son obligatorios");
        }
        Reservacion reservacion = reservacionService.createReservacion(reservacionDTO);
        return ResponseEntity.ok(reservacion);
    }

    @GetMapping("/fecha/{fecha}")
    public ResponseEntity<List<Reservacion>> obtenerPorFecha(@PathVariable String fecha) {
        LocalDate fechaReserva = LocalDate.parse(fecha);
        return ResponseEntity.ok(reservacionService.getReservacionesPorFecha(fechaReserva));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Reservacion> actualizarReservacion(@PathVariable Integer id, @RequestBody ReservacionDTO reservacionDTO) {
        return ResponseEntity.ok(reservacionService.updateReservacion(id, reservacionDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReservacion(@PathVariable Integer id) {
        reservacionService.deleteReservacion(id);
        return ResponseEntity.noContent().build();
    }
}