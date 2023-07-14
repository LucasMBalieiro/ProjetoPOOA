package br.ufscar.pooa.model.servicos.equipamentocliente.status;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

public class EEmManutencao extends StatusEquipamento {
  @Override
  public void iniciarColeta(EquipamentoCliente equipamentoCliente) {
    equipamentoCliente.setStatus(new EAguardandoColeta());
  }
}
