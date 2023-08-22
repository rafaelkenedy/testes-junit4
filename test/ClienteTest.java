import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    @Test
    public void testeCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");
        Assert.assertEquals("Rafael", cliente.getNome());
    }


}