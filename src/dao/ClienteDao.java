package dao;

import domain.Cliente;
import gerics.GenericDao;
import service.ClienteService;

public class ClienteDao extends GenericDao<Cliente> implements IClienteDao {

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public Class<Cliente> atualizarDados(Cliente entity, Cliente entityCadastrado) {
        return null;
    }

}
