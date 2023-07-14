package br.ufscar.pooa.model.servicos.equipamentocliente.status;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

public class EEmAnalise extends StatusEquipamento {
    @Override
    public void iniciarManutencao(EquipamentoCliente equipamentoCliente) {
        equipamentoCliente.setStatus(new EEmManutencao());
    }
}
