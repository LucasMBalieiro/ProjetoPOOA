package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.services.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;

import java.util.List;

public class TrocaDePeca extends ServicoFornecido {

  public TrocaDePeca(String nome, String descricao, List<IItemDeServico> itens, EquipamentoAceitoParaServico equipamento, double valor) {
    super(nome, descricao, itens, equipamento, valor);
  }

  public double calcularCusto() {
    double valor = 0;

    for (IItemDeServico item : this.itens) {
      valor += item.obterValor();
    }

    return this.equipamento.getValorDeMaoDeObra() + valor;
  }

  public String obterDescricao() {
    return "Troca de peça: " + this.descricao;
  }
}
