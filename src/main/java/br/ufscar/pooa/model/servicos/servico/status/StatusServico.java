package br.ufscar.pooa.model.servicos.servico.status;

import br.ufscar.pooa.model.servicos.servico.Servico;

public abstract class StatusServico {
  protected boolean estaPago = false;

  public void iniciar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser iniciado.");
  }

  public void cancelar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser cancelado.");
  }

  public void finalizar(Servico servico) {
    throw new RuntimeException("O serviço não pode ser finalizado.");
  }

  public void registrarPagamento() {
    this.estaPago = true;
  }

  @Override
  public String toString() {
    return "StatusServico{" +
        "estaPago=" + estaPago +
        "status=" + this.getClass().getSimpleName() +
        '}';
  }
}
