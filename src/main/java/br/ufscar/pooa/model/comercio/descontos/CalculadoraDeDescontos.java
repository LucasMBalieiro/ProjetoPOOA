package br.ufscar.pooa.model.comercio.descontos;

import br.ufscar.pooa.model.comercio.Venda;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeDescontos {
  private DescontoHandler primeiro;
  private DescontoHandler ultimo;

  public CalculadoraDeDescontos(List<DescontoHandler> descontoHandlerList) {
    for (DescontoHandler descontoHandler : descontoHandlerList) {
      adicionarDesconto(descontoHandler);
    }
  }

  public void adicionarDesconto(DescontoHandler descontoHandler) {
    if (primeiro == null) {
      primeiro = descontoHandler;
    } else {
      ultimo.setProximoDesconto(descontoHandler);
    }

    ultimo = descontoHandler;
  }

  public List<DescontoDePagamento> aplicarDesconto(Venda venda) {
    List<DescontoDePagamento> descontos = new ArrayList<>();

    if (primeiro != null) {
      primeiro.aplicarDesconto(venda, descontos);
    }

    return descontos;
  }
}
