package br.ufscar.pooa.model.comercio.descontos;

public class DescontoDePagamento {
  private String nome;
  private double percentualDesconto;
  private double valorDesconto;

  public DescontoDePagamento(String nome, double percentualDesconto, double valorDesconto) {
    this.nome = nome;
    this.percentualDesconto = percentualDesconto;
    this.valorDesconto = valorDesconto;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPercentualDesconto() {
    return percentualDesconto;
  }

  public void setPercentualDesconto(double percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  public double getValorDesconto() {
    return valorDesconto;
  }

  public void setValorDesconto(double valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  @Override
  public String toString() {
    return "DescontoDePagamento{" +
        "nome='" + nome + '\'' +
        ", percentualDesconto=" + percentualDesconto +
        ", valorDesconto=" + valorDesconto +
        '}';
  }
}
