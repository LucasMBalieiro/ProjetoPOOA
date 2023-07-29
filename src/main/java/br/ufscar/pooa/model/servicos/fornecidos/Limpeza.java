package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;

import java.util.List;

public class Limpeza extends ServicoFornecido {

  public Limpeza(String nome, String descricao, List<IItemDeServico> itens, EquipamentoAceitoParaServico equipamento, double valor) {
    super(nome, descricao, itens, equipamento, valor);
  }

  public double calcularCusto() {
    return this.valor;
  }

  public String obterDescricao() {
    return "Limpeza: " + this.descricao;
  }
}
