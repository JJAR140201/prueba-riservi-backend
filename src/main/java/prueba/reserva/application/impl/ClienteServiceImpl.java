package prueba.reserva.application.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prueba.reserva.application.service.ClienteService;
import prueba.reserva.domain.Cliente;
import prueba.reserva.infrastructure.dao.cliente.ClienteDao;
import prueba.reserva.infrastructure.dto.ClienteDTO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteDao clienteDao;

    @Override
    public Cliente createCliente(ClienteDTO clienteDTO) {
        Cliente cliente = Cliente.builder()
                .nombre(clienteDTO.getNombre())
                .email(clienteDTO.getEmail())
                .telefono(clienteDTO.getTelefono())
                .build();
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente getClienteById(Integer idCliente) {
        // Manejo explícito del Optional
        return clienteDao.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + idCliente));
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteDao.findAll();
    }

    @Override
    public Cliente updateCliente(Integer idCliente, ClienteDTO clienteDTO) {
        // Manejo explícito del Optional
        Cliente cliente = clienteDao.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + idCliente));
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefono(clienteDTO.getTelefono());
        return clienteDao.save(cliente);
    }

    @Override
    public void deleteCliente(Integer idCliente) {
        clienteDao.deleteById(idCliente);
    }

}
