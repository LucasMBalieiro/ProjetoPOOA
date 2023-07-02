package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public class EmAnalise extends StatusServico {
  @Override
  public void aprovar(Servico servico) {
    servico.setStatus(new Aprovado());
  }
}
