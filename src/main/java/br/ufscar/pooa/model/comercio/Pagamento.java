package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.comercio.descontos.DescontoDePagamento;

import java.util.List;

public class Pagamento {
  private double subtotal;
  private double total;
  private List<DescontoDePagamento> descontos;
  private String metodo;
  private Venda venda;

  public Pagamento(double subtotal, double total, List<DescontoDePagamento> descontos, String metodo, Venda venda) {
    this.subtotal = subtotal;
    this.total = total;
    this.descontos = descontos;
    this.metodo = metodo;
    this.venda = venda;
  }

  // Passo extra: por causa da falta de banco de dados
  public Pagamento(String metodo, Venda venda) {
    this.metodo = metodo;
    this.venda = venda;
  }

  public void pagar() {
    this.venda.pagar();
    System.out.println("Pagamento realizado com sucesso!");
  }

  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public List<DescontoDePagamento> getDescontos() {
    return descontos;
  }

  public void setDescontos(List<DescontoDePagamento> descontos) {
    this.descontos = descontos;
  }

  public String getMetodo() {
    return metodo;
  }

  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }

  @Override
  public String toString() {
    return "Pagamento{" +
        "subtotal=" + subtotal +
        ", total=" + total +
        ", descontos=" + descontos +
        ", metodo='" + metodo + '\'' +
        ", venda=" + venda +
        '}';
  }
}
