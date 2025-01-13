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
import prueba.reserva.application.service.HorarioDisponibleService;
import prueba.reserva.domain.HorarioDisponible;
import prueba.reserva.infrastructure.dto.HorarioDisponibleDTO;

import java.util.List;

@RestController
@RequestMapping("/api/horarioDisponible")
@CrossOrigin("*")
@RequiredArgsConstructor
public class HorarioDisponibleController {

    private final HorarioDisponibleService horarioDisponibleService;

    @PostMapping
    public ResponseEntity<HorarioDisponible> createHorario(@RequestBody HorarioDisponibleDTO horarioDisponibleDTO) {
        return ResponseEntity.ok(horarioDisponibleService.createHorario(horarioDisponibleDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<HorarioDisponible> getHorarioById(@PathVariable Integer id) {
        return ResponseEntity.ok(horarioDisponibleService.getHorarioById(id));
    }

    @GetMapping
    public ResponseEntity<List<HorarioDisponible>> getAllHorarios() {
        return ResponseEntity.ok(horarioDisponibleService.getAllHorarios());
    }

    @PutMapping("/{id}")
    public ResponseEntity<HorarioDisponible> updateHorario(@PathVariable Integer id, @RequestBody HorarioDisponibleDTO horarioDisponibleDTO) {
        return ResponseEntity.ok(horarioDisponibleService.updateHorario(id, horarioDisponibleDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHorario(@PathVariable Integer id) {
        horarioDisponibleService.deleteHorario(id);
        return ResponseEntity.noContent().build();
    }

}
