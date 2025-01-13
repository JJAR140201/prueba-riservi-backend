package prueba.reserva.application.service;

import prueba.reserva.domain.Cliente;
import prueba.reserva.infrastructure.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    Cliente createCliente(ClienteDTO clienteDTO);
    Cliente getClienteById(Integer idCliente);
    List<Cliente> getAllClientes();
    Cliente updateCliente(Integer idCliente, ClienteDTO clienteDTO);
    void deleteCliente(Integer idCliente);

}
