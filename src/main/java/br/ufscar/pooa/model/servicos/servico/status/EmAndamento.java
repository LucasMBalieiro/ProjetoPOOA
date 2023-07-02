package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public class EmAndamento extends StatusServico {
  @Override
  public void cancelar(Servico servico) {
    servico.setStatus(new Cancelado());
  }

  @Override
  public void finalizar(Servico servico) {
    servico.setStatus(new Finalizado());
  }
}
