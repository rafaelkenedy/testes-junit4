package service;

import dao.ClienteDao;
import dao.IClienteDao;
import domain.Cliente;
import exceptions.TipoChaveNaoEcontradoException;

import java.util.Optional;

public class ClienteService implements IClienteService {

    public Long valorExcluido = null;

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }


    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEcontradoException {
        return clienteDao.cadastrar(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorCpf(Long cpf) {
        return Optional.ofNullable(clienteDao.consultar(cpf));
    }

    @Override
    public void excluir(Long cpf) throws TipoChaveNaoEcontradoException {
        valorExcluido = cpf;
        clienteDao.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEcontradoException {
        clienteDao.alterar(cliente);
    }
}
