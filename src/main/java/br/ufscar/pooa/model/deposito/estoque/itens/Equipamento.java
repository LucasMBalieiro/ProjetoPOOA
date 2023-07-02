package br.ufscar.pooa.model.deposito.estoque.itens;

import java.util.List;

public class Equipamento extends ItemDeEstoque {
  private String tipo;
  private double valorMaoDeObra;
  private double valorEntregaTecnica;
  private List<Peca> pecas;

  public Equipamento(String marca, String modelo, int quantidadeDeEstoque, double valor) {
    super(marca, modelo, quantidadeDeEstoque, valor);
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getValorMaoDeObra() {
    return valorMaoDeObra;
  }

  public void setValorMaoDeObra(double valorMaoDeObra) {
    this.valorMaoDeObra = valorMaoDeObra;
  }

  public double getValorEntregaTecnica() {
    return valorEntregaTecnica;
  }

  public void setValorEntregaTecnica(double valorEntregaTecnica) {
    this.valorEntregaTecnica = valorEntregaTecnica;
  }

  public List<Peca> getPecas() {
    return pecas;
  }

  public void setPecas(List<Peca> pecas) {
    this.pecas = pecas;
  }
}
