package prueba.reserva.infrastructure.dao.cliente;

import prueba.reserva.domain.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteDao {

    Cliente save(Cliente cliente);
    Optional<Cliente> findById(Integer idCliente);
    List<Cliente> findAll();
    void deleteById(Integer idCliente);

}
