package services.application.cliente;

import java.util.List;

import model.Cliente;
import services.application.RequestResult;

public interface ListaClientePort {
    RequestResult<List<Cliente>> listarClientes();
}