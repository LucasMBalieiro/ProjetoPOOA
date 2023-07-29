package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.comercio.Orcamento;
import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
  private String nomeDeUsuario;
  private String senha;
  private boolean isGerente;

  public Funcionario(String nome, String cpf, String telefone, String email, String endereco, String nomeDeUsuario, String senha, boolean isGerente) {
    super(nome, cpf, telefone, email, endereco);
    this.nomeDeUsuario = nomeDeUsuario;
    this.senha = senha;
    this.isGerente = isGerente;
  }

  public String getNomeDeUsuario() {
    return nomeDeUsuario;
  }

  public void setNomeDeUsuario(String nomeDeUsuario) {
    this.nomeDeUsuario = nomeDeUsuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public boolean isGerente() {
    return isGerente;
  }

  public void setGerente(boolean gerente) {
    isGerente = gerente;
  }
}
