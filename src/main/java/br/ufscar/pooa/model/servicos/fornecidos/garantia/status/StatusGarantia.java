package br.ufscar.pooa.model.servicos.fornecidos.garantia.status;

import br.ufscar.pooa.model.servicos.fornecidos.garantia.Garantia;

public abstract class StatusGarantia {
    public void aprovar(Garantia garantia) {
        throw new RuntimeException("A garantia não pode ser aprovada.");
    }

    public void reprovar(Garantia garantia) {
        throw new RuntimeException("A garantia não pode ser reprovada.");
    }

    public String obterRespostaFabrica(Garantia garantia) {
       return garantia.getRespostaFabrica();
    }
}
