package gerics;

import domain.Persistente;
import exceptions.TipoChaveNaoEcontradoException;

import java.util.Collection;

public interface IGenericDao <T extends Persistente> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEcontradoException;

    public void excluir(Long valor);

    public void alterar(T entity) throws TipoChaveNaoEcontradoException;

    public T consultar(Long valor);

    public Collection<T> buscarTodos();




}
