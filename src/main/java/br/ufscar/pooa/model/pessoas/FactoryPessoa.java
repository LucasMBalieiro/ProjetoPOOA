package br.ufscar.pooa.model.pessoas;

public class FactoryPessoa {
  public Cliente criarCliente(String nome, String cpf, String telefone, String email, String endereco) {
    return new Cliente(nome, cpf, telefone, email, endereco);
  }

  public Funcionario criarFuncionario(String nome, String cpf, String telefone, String email, String endereco, String nomeDeUsuario, String senha, boolean isGerente) {
    return new Funcionario(nome, cpf, telefone, email, endereco, nomeDeUsuario, senha, isGerente);
  }
}
