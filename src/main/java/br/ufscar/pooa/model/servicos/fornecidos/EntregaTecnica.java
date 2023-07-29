package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;

import java.util.List;

public class EntregaTecnica extends ServicoFornecido {

  public EntregaTecnica(String nome, String descricao, List<IItemDeServico> itens, EquipamentoAceitoParaServico equipamento, double valor) {
    super(nome, descricao, itens, equipamento, valor);
  }

  public double calcularCusto() {
    return this.equipamento.getValorDeEntregaTecnica();
  }

  public String obterDescricao() {
    return "Entrega Técnica: " + this.descricao;
  }
}
