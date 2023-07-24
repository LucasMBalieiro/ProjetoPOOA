package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.pessoas.Cliente;

import java.util.Date;
import java.util.List;

public class Orcamento {
  private int id;
  private List<Item> itens;
  private Cliente cliente;
  private Date data;
  private double valorTotal;
  private String template;

  // Constructor
  public Orcamento(int id, List<Item> itens, Cliente cliente, Date data, double valorTotal) {
    this.id = id;
    this.itens = itens;
    this.cliente = cliente;
    this.data = data;
    this.valorTotal = valorTotal;

    this.template = "orcamento";
  }

  // Setter and Getter methods
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public String getTemplate() {
    return template;
  }
}