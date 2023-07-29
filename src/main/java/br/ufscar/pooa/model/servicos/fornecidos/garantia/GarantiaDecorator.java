package br.ufscar.pooa.model.servicos.fornecidos.garantia;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;

import java.util.List;

public abstract class GarantiaDecorator extends ServicoFornecido {
  protected ServicoFornecido servicoDecorado;


  public GarantiaDecorator(String nome,
                           String descricao,
                           List<IItemDeServico> itens,
                           EquipamentoAceitoParaServico equipamento,
                           double valor,
                           ServicoFornecido servicoDecorado) {
    super(nome, descricao, itens, equipamento, valor);
    this.servicoDecorado = servicoDecorado;
  }

  public double calcularCusto() {
    return this.servicoDecorado.calcularCusto();
  }

  public String obterDescricao() {
    return servicoDecorado.obterDescricao(); // Descrição com a adição da garantia
  }

}
