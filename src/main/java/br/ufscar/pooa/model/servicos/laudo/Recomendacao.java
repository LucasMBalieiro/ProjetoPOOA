package br.ufscar.pooa.model.servicos.laudo;

import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;

public class Recomendacao {
  private String defeitosEncontrados;
  private ServicoFornecido servico;

  public Recomendacao(String defeitosEncontrados, ServicoFornecido servico) {
    this.defeitosEncontrados = defeitosEncontrados;
    this.servico = servico;
  }

  public String getDefeitosEncontrados() {
    return defeitosEncontrados;
  }

  public void setDefeitosEncontrados(String defeitosEncontrados) {
    this.defeitosEncontrados = defeitosEncontrados;
  }

  public ServicoFornecido getServico() {
    return servico;
  }

  public void setServico(ServicoFornecido servico) {
    this.servico = servico;
  }

  public double getValor() {
    return servico.getValor();
  }

  @Override
  public String toString() {
    return "Recomendacao{" +
        "defeitosEncontrados='" + defeitosEncontrados + '\'' +
        ", servico=" + servico +
        '}';
  }
}
