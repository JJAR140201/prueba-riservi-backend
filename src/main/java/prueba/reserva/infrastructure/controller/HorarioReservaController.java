package prueba.reserva.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prueba.reserva.application.service.HorarioReservaService;
import prueba.reserva.domain.HorarioReserva;
import prueba.reserva.infrastructure.dto.HorarioReservaDTO;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/horariosReserva")
@CrossOrigin("*")
@RequiredArgsConstructor
public class HorarioReservaController {

    private final HorarioReservaService horarioReservaService;

    @PostMapping
    public ResponseEntity<HorarioReserva> createHorarioReserva(@RequestBody HorarioReservaDTO horarioReservaDTO) {
        return ResponseEntity.ok(horarioReservaService.createHorarioReserva(horarioReservaDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HorarioReserva> getHorarioReservaById(@PathVariable Integer id) {
        return ResponseEntity.ok(horarioReservaService.getHorarioReservaById(id));
    }

    @GetMapping
    public ResponseEntity<List<HorarioReservaDTO>> getAllHorariosReserva() {
        List<HorarioReservaDTO> horariosReserva = horarioReservaService.getAllHorariosReserva()
                .stream()
                .map(horario -> new HorarioReservaDTO(
                        horario.getIdHorarioReserva(),
                        horario.getHorarioDisponible().getIdHorario(), // Extraer el ID
                        horario.getEstado()))
                .collect(Collectors.toList());
        return ResponseEntity.ok(horariosReserva);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HorarioReserva> updateHorarioReserva(@PathVariable Integer id, @RequestBody HorarioReservaDTO horarioReservaDTO) {
        return ResponseEntity.ok(horarioReservaService.updateHorarioReserva(id, horarioReservaDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHorarioReserva(@PathVariable Integer id) {
        horarioReservaService.deleteHorarioReserva(id);
        return ResponseEntity.noContent().build();
    }

}
