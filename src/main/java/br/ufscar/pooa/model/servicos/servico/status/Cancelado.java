package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public class Cancelado extends StatusServico {
  @Override
  public void finalizar(Servico servico) {
    servico.setStatus(new Finalizado());
  }
}
