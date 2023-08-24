import dao.IClienteDao;
import domain.Cliente;
import exceptions.TipoChaveNaoEcontradoException;
import mocks.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.ClienteService;
import service.IClienteService;


import java.util.Optional;

import static org.junit.Assert.*;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;
    private IClienteDao dao;

    public ClienteServiceTest() {
        dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Rafael");
        cliente.setCpf(12345678965L);
    }

    @Test
    public void pesquisarCliente() {
        Optional<Cliente> clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEcontradoException {
        Boolean retorno = clienteService.salvar(cliente);
        assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws TipoChaveNaoEcontradoException {
        clienteService.excluir(cliente.getCpf());
        assertEquals(cliente.getCpf(), ((ClienteService) clienteService).valorExcluido);
    }


}