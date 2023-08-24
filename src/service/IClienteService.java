package service;

import domain.Cliente;
import exceptions.TipoChaveNaoEcontradoException;

import java.util.Optional;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEcontradoException;

    Optional<Cliente> buscarPorCpf(Long cpf);

    void excluir(Long cpf) throws TipoChaveNaoEcontradoException;

    void alterar(Cliente cliente) throws TipoChaveNaoEcontradoException;
}
