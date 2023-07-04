package br.ufscar.pooa.controller;

import br.ufscar.pooa.model.servicos.EquipamentoCliente;
import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.itens.Peca;
import java.util.ArrayList;
import java.util.List;

public class EquipClienteController {
    private List<EquipamentoCliente> equipamentosClientes;

    public EquipClienteController() {
        equipamentosClientes = new ArrayList<>();
    }

    public void adicionar(EquipamentoCliente equipamentoCliente) {
        equipamentosClientes.add(equipamentoCliente);
    }

    public void remover(EquipamentoCliente equipamentoCliente) {
        equipamentosClientes.remove(equipamentoCliente);
    }

    public void atualizar(EquipamentoCliente equipamentoCliente, Equipamento novoEquipamento) {

        for (EquipamentoCliente equipCliente : equipamentosClientes) {
            if (equipCliente.equals(equipamentoCliente)) {
                equipCliente.setEquipamento(novoEquipamento);
                return;
            }
        }
    }

    public List<EquipamentoCliente> obterPorModelo(String modelo) {
        List<EquipamentoCliente> equipamentosClientesPorModelo = new ArrayList<>();

        for (EquipamentoCliente equipamentoCliente : equipamentosClientes) {
            if (equipamentoCliente.getEquipamento().getModelo().equals(modelo)) {
                equipamentosClientesPorModelo.add(equipamentoCliente);
            }
        }

        return equipamentosClientesPorModelo;
    }

    public List<EquipamentoCliente> obterPorMarca(String marca) {
        List<EquipamentoCliente> equipamentosClientesPorMarca = new ArrayList<>();

        for (EquipamentoCliente equipamentoCliente : equipamentosClientes) {
            if (equipamentoCliente.getEquipamento().getMarca().equals(marca)) {
                equipamentosClientesPorMarca.add(equipamentoCliente);
            }
        }

        return equipamentosClientesPorMarca;
    }

    public List<Peca> obterPecas(EquipamentoCliente equipamentoCliente) {
        return equipamentoCliente.getEquipamento().getPecas();
    }

    public List<EquipamentoCliente> obterTodosEquip() {
        return equipamentosClientes;
    }
}
