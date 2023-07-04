package br.ufscar.pooa.controller;

import br.ufscar.pooa.model.deposito.estoque.itens.Peca;
import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import java.util.ArrayList;
import java.util.List;

public class PecaController {
    private List<Peca> pecas;

    public PecaController() {
        this.pecas = new ArrayList<>();
    }

    public void adicionar(Peca peca) {
        pecas.add(peca);
    }

    public void remover(Peca peca) {
        pecas.remove(peca);
    }

    public void atualizar(Peca peca) {
    for (int i = 0; i < pecas.size(); i++) {
        if (pecas.get(i).equals(peca)) {
            pecas.set(i, peca);
            return;
        }
    }
}

    public List<Peca> obterPorModelo(String modelo) {
        List<Peca> pecasPorModelo = new ArrayList<>();
        // Filtra as peças pelo modelo
        for (Peca peca : pecas) {
            if (peca.getModelo().equals(modelo)) {
                pecasPorModelo.add(peca);
            }
        }
        return pecasPorModelo;
    }

    public List<Peca> obterPorMarca(String marca) {
        List<Peca> pecasPorMarca = new ArrayList<>();
        // Filtra as peças pela marca
        for (Peca peca : pecas) {
            if (peca.getMarca().equals(marca)) {
                pecasPorMarca.add(peca);
            }
        }
        return pecasPorMarca;
    }

    public List<Equipamento> obterEquipamentos() {
        List<Equipamento> equipamentos = new ArrayList<>();
        // Obtém todos os equipamentos das peças
        for (Peca peca : pecas) {
            equipamentos.addAll(peca.getEquipamentos());
        }
        return equipamentos;
    }
}

