package service;

import dao.ClienteDao;
import mocks.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteDaoMock clienteDaoMock = new ClienteDaoMock();
        //ClienteService clienteService = new ClienteService(clienteDaoMock);
        //String retorno = clienteService.salvar();
        //Assert.assertEquals("Sucesso", retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void salvarErrorTest(){
        ClienteDao clienteDao = new ClienteDao();
        //ClienteService clienteService = new ClienteService(clienteDao);
        //clienteService.salvar();
    }

}