package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;

import java.util.List;

public class Rebobinamento extends ServicoFornecido {
  private String potencia;
  private String voltagem;
  private String polos;

  public Rebobinamento(String nome,
                       String descricao,
                       List<Utilizavel> itens,
                       Equipamento equipamento,
                       double valor,
                       String potencia,
                       String voltagem,
                       String polos) {
    super(nome, descricao, itens, equipamento, valor);
    this.polos = polos;
    this.potencia = potencia;
    this.voltagem = voltagem;
  }

  public double calcularCusto() {
    return this.valor;
  }

  public String obterDescricao() {
    return "Rebobinamento: " + this.descricao;
  }
}
