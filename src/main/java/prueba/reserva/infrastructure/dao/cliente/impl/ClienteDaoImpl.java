package prueba.reserva.infrastructure.dao.cliente.impl;

import ch.qos.logback.core.net.server.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import prueba.reserva.domain.Cliente;
import prueba.reserva.infrastructure.dao.cliente.ClienteDao;
import prueba.reserva.infrastructure.dao.cliente.ClienteRepository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ClienteDaoImpl implements ClienteDao {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> findById(Integer idCliente) {
        return clienteRepository.findById(idCliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public void deleteById(Integer idCliente) {
        clienteRepository.deleteById(idCliente);
    }

}
