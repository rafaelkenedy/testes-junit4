package service;

import dao.ContratoDao;
import dao.IContratoDao;
import mocks.ContratoMock;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarErrorTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        service.salvar();
    }
}
