package br.com.moreno.service;

import br.com.moreno.dao.IContratoDao;

public class ContratoService implements IContratoService {

    public ContratoService(IContratoDao dao) {
    }

    public String salvar(){
        return "Contrato Salvo com sucesso!";
    }

    public String excluir(){
        return "Contrato Deletado com sucesso!";
    }

    public String atualizar(){
        return "Contrato Editado com sucesso!";
    }


    public String buscar(){
        return "Contrato encontrado com sucesso!";
    }
}
