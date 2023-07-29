package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.documentos.Documento;
import br.ufscar.pooa.model.documentos.GeradorOrcamento;
import br.ufscar.pooa.model.pessoas.Cliente;

import java.util.List;

public class Orcamento extends Documento {
  private List<Item> itens;
  private Cliente cliente;
  private double valorTotal;

  // Constructor
  public Orcamento(Long id, List<Item> itens, Cliente cliente, double valorTotal) {
    super(id, "orcamento");

    this.itens = itens;
    this.cliente = cliente;
    this.valorTotal = valorTotal;
    this.geradorPdf = new GeradorOrcamento(this);
  }

  public List<Item> getItens() {
    return itens;
  }

  public void setItens(List<Item> itens) {
    this.itens = itens;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

}