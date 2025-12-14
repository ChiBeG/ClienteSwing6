package services.application.cliente;

import java.util.List;

import model.Cliente;
import services.application.RequestResult;
import services.domain.persistence.ClienteRepository;
import services.domain.persistence.RepositoryPool;

public class ListaClienteCtrl implements ListaClientePort {

    @Override
    public RequestResult<List<Cliente>> listarClientes() {
        var repo = RepositoryPool.acquire(ClienteRepository.class);
        var clientes = repo.findAll();
        return RequestResult.success(clientes);
    }

}
