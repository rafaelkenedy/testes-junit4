package exceptions;

public class TipoChaveNaoEcontradoException extends Exception {
    public TipoChaveNaoEcontradoException(String msg) {
        this(msg, null);
    }
    public TipoChaveNaoEcontradoException(String msg, Throwable e) {
        super(msg, e);
    }
}
