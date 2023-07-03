package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.servicos.EquipamentoCliente;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String endereco;
    private ArrayList<EquipamentoCliente> equipamentos;

    public Cliente(String CPF, String nome, String login, String senha, String telefone, String email, String endereco) {
        super(CPF, nome, login, senha, telefone, email);
        this.endereco = endereco;
        this.equipamentos = new ArrayList<>();
    }
}