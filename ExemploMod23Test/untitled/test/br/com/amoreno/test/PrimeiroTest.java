package br.com.amoreno.test;

import br.com.moreno.dao.ContratoDao;
import br.com.moreno.dao.IContratoDao;
import br.com.moreno.service.ContratoService;
import br.com.moreno.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTest {

    @Test
    public void SalvarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService servise = new ContratoService(dao);
        String retorno = servise.salvar();
        Assert.assertEquals("Contrato Salvo com sucesso!", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService servise = new ContratoService(dao);
        String retorno = servise.atualizar();
    }

    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService servise = new ContratoService(dao);
        String retorno = servise.buscar();
    }

    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService servise = new ContratoService(dao);
        String retorno = servise.excluir();
    }
}
