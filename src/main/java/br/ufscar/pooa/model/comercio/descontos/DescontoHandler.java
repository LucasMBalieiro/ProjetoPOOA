package br.ufscar.pooa.model.comercio.descontos;

import br.ufscar.pooa.model.comercio.Venda;

import java.util.List;

public abstract class DescontoHandler {
  protected DescontoHandler proximo;

  public void setProximoDesconto(DescontoHandler proximo) {
    this.proximo = proximo;
  }

  public boolean temProximo() {
    return proximo != null;
  }

  public abstract void aplicarDesconto(Venda venda, List<DescontoDePagamento> descontos);
}
