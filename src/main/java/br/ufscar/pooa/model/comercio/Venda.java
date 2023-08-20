package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.comercio.descontos.DescontoDePagamento;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.servico.Servico;

import java.lang.reflect.Array;
import java.util.List;

public class Venda {
  private List<Item> itens;
  private Cliente cliente;
  private List<Servico> servicos;
  private Pagamento pagamento; // necessario enquanto nao há banco de dados

  public Venda(List<Item> itens, Cliente cliente, List<Servico> servicos) {
    this.itens = itens;
    this.cliente = cliente;
    this.servicos = servicos;
  }

  public Venda(List<Item> itens, Cliente cliente) {
    this.itens = itens;
    this.cliente = cliente;
  }

  public double getValorItens() {
    double valorTotal = 0;
    if (servicos != null) {
      for (Servico servico : servicos) {
        valorTotal += servico.getValor();
      }
    }

    if (itens != null) {
      for (Item item : itens) {
        valorTotal += item.getProduto().getValor();
      }
    }

    return valorTotal;
  }

  // Setter and Getter methods
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

  public void pagar() {
    if (servicos != null) {
      for (Servico servico : servicos) {
        servico.registrarPagamento();
      }
    }

    if (itens != null) {
      for (Item item : itens) {
        item.getProduto().registrarVenda(item.getQuantidade());
      }
    }

  }

  public List<Servico> getServicos() {
    return servicos;
  }

  public void setServicos(List<Servico> servicos) {
    this.servicos = servicos;
  }

  public Pagamento getPagamento() {
    return pagamento;
  }

  public void setPagamento(Pagamento pagamento) {
    this.pagamento = pagamento;
  }

  @Override
  public String toString() {
    return "Venda{" +
        "itens=" + itens +
        ", cliente=" + cliente +
        ", servicos=" + servicos +
        '}';
  }
}