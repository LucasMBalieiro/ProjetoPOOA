package br.ufscar.pooa.model.servicos.equipamentocliente.status;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

public abstract class StatusEquipamento {
    public void iniciarManutencao(EquipamentoCliente equipamentoCliente) {
        throw new RuntimeException("O equipamento não pode ser iniciado em manutenção.");
    }
    public void iniciarColeta(EquipamentoCliente equipamentoCliente) {
        throw new RuntimeException("O equipamento não pode ser iniciado em coleta.");
    }
    public void entregar(EquipamentoCliente equipamentoCliente) {
        throw new RuntimeException("O equipamento não pode ser entregue.");
    }
}
