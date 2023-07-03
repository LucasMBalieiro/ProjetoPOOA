package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.comercio.Orcamento;
import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.servicos.EquipamentoCliente;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    public Funcionario(String CPF, String nome, String login, String senha, String telefone, String email) {
        super(CPF, nome, login, senha, telefone, email);
    }

    public void gerarFatura(Orcamento valor) {
    }

    public void realizarOrcamento(ArrayList<Item> itens) {
    }

    public Cliente cadastrarCliente() {
        return null;
    }

    public EquipamentoCliente cadastrarEquipamento() {
        return null;
    }
}
