package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {
    private IContratoDao contratoDao;
    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;

    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}
