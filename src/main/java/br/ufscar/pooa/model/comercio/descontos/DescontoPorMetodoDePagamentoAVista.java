package br.ufscar.pooa.model.comercio.descontos;

import br.ufscar.pooa.model.comercio.Venda;

import java.util.List;

public class DescontoPorMetodoDePagamentoAVista extends DescontoHandler {

  // Desconto de 10% para pagamentos à vista
  @Override
  public void aplicarDesconto(Venda venda, List<DescontoDePagamento> descontos) {
    if (venda.getPagamento().getMetodo().equals("Dinheiro") || venda.getPagamento().getMetodo().equals("PIX")) {
      double valorDesconto = venda.getValorItens() * 0.1;
      descontos.add(new DescontoDePagamento("Desconto por pagamento à vista", 0.1, valorDesconto));
    }
  }
}
