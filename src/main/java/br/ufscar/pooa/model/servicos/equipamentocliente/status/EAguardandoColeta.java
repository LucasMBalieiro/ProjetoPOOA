package br.ufscar.pooa.model.servicos.equipamentocliente.status;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

public class EAguardandoColeta extends StatusEquipamento {
    @Override
    public void entregar(EquipamentoCliente equipamentoCliente) {
        equipamentoCliente.setStatus(new EEntregue());
    }
}
