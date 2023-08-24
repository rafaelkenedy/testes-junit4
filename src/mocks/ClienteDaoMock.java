package mocks;

import dao.IClienteDao;
import domain.Cliente;
import exceptions.TipoChaveNaoEcontradoException;

import java.util.Collection;

public class ClienteDaoMock implements IClienteDao {

    public Long valorExcluido = null;

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEcontradoException {
        return true;
    }

    @Override
    public void excluir(Long valor) {
        this.valorExcluido = valor;
    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEcontradoException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);;
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
