package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.comercio.Orcamento;
import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.util.ArrayList;

public class Funcionario extends Usuario {
  private DadosPessoais dadosPessoais;

  public Funcionario(String nomeDeUsuario, String senha, DadosPessoais dadosPessoais) {
    super(nomeDeUsuario, senha);
    this.dadosPessoais = dadosPessoais;
  }

  public DadosPessoais getDadosPessoais() {
    return dadosPessoais;
  }

  public void setDadosPessoais(DadosPessoais dadosPessoais) {
    this.dadosPessoais = dadosPessoais;
  }

  @Override
  public String toString() {
    return "Funcionario{" +
        "dadosPessoais=" + dadosPessoais +
        '}';
  }
}
