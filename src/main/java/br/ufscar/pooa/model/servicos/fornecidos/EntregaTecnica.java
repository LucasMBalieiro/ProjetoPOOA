package br.ufscar.pooa.model.servicos.fornecidos;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;

import java.util.List;

public class EntregaTecnica extends ServicoFornecido {

  private double distanciaDestinatarioLoja; // Novo atributo para armazenar a distância

  public EntregaTecnica(String nome, String descricao, List<IItemDeServico> itens, EquipamentoAceitoParaServico equipamento, double valor, double distanciaDestinatarioLoja) {
    super(nome, descricao, itens, equipamento, valor);
    this.distanciaDestinatarioLoja = distanciaDestinatarioLoja;
  }

  @Override
  public double calcularCusto() {
    double custo = this.equipamento.getValorDeEntregaTecnica();

    // Alteração do requisito 1
    if (distanciaDestinatarioLoja > 3 && distanciaDestinatarioLoja <= 7) {
      custo += 10.0;
    } else if (distanciaDestinatarioLoja > 7 && distanciaDestinatarioLoja <= 10) {
      custo += 15.0;
    } else if (distanciaDestinatarioLoja > 10) {
      throw new IllegalArgumentException("Distância maior que 10 quilômetros não é aceita.");
    }

    return custo;
  }

  public String obterDescricao() {
    return "Entrega Técnica: " + this.descricao;
  }
}
