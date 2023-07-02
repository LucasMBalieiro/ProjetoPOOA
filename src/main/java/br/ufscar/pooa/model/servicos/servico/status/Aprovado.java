package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public class Aprovado extends StatusServico {
  @Override
  public void cancelar(Servico servico) {
    servico.setStatus(new Cancelado());
  }

  @Override
  public void iniciar(Servico servico) {
    servico.setStatus(new EmAndamento());
  }
}
