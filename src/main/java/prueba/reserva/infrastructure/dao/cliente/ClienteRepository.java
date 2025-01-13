package prueba.reserva.infrastructure.dao.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.reserva.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
