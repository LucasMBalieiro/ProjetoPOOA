package br.ufscar.pooa.model.pessoas;

public class Gerente extends Funcionario {
    public Gerente(String CPF, String nome, String login, String senha, String telefone, String email) {
        super(CPF, nome, login, senha, telefone, email);
    }

    public void realizarRelatorioDeVenda() {
    }
}