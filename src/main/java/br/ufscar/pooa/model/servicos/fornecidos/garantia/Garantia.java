package br.ufscar.pooa.model.servicos.fornecidos.garantia;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.Utilizavel;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;

import java.util.List;

public class Garantia extends GarantiaDecorator {

  public Garantia(String nome,
                  String descricao,
                  List<Utilizavel> itens,
                  Equipamento equipamento,
                  double valor,
                  ServicoFornecido servicoDecorado) {
    super(nome, descricao, itens, equipamento, valor, servicoDecorado);
  }

  public double calcularCusto() {
    return 0; // Custo zero para a garantia
  }

  public String obterDescricao() {
    return servicoDecorado.obterDescricao() + " + Garantia"; // Descrição com a adição da garantia
  }
}
