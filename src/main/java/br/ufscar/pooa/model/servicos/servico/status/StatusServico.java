package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public abstract class StatusServico {

  public void iniciar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser iniciado.");
  }

  public void cancelar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser cancelado.");
  }

  public void finalizar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser finalizado.");
  }
}
