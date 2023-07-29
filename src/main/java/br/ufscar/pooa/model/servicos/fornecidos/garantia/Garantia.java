package br.ufscar.pooa.model.servicos.fornecidos.garantia;

import br.ufscar.pooa.model.armazenamento.estoque.IItemDeServico;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.fornecidos.garantia.status.StatusGarantia;

import java.util.List;

public class Garantia extends GarantiaDecorator {
  private StatusGarantia status;
  private String respostaFabrica;

  public Garantia(String nome,
                  String descricao,
                  List<IItemDeServico> itens,
                  EquipamentoAceitoParaServico equipamento,
                  double valor,
                  ServicoFornecido servicoDecorado) {
    super(nome, descricao, itens, equipamento, valor, servicoDecorado);
  }

  @Override
  public double calcularCusto() {
    return 0; // Custo zero para a garantia
  }

  @Override
  public String obterDescricao() {
    return "Serviço em garantia: " + servicoDecorado.obterDescricao(); // Descrição com a adição da garantia
  }

  public StatusGarantia getStatus() {
    return status;
  }

  public void setStatus(StatusGarantia status) {
    this.status = status;
  }

  public void aprovar() {
    this.status.aprovar(this);
  }

  public void reprovar() {
    this.status.reprovar(this);
  }

  public String getRespostaFabrica() {
    return respostaFabrica;
  }

  public void setRespostaFabrica(String respostaFabrica) {
    this.respostaFabrica = respostaFabrica;
  }
}
