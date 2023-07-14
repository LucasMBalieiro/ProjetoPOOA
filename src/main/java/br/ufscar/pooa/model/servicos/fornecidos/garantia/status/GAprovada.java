package br.ufscar.pooa.model.servicos.fornecidos.garantia.status;

import br.ufscar.pooa.model.servicos.fornecidos.garantia.Garantia;

public class GAprovada extends StatusGarantia {
    @Override
    public String obterRespostaFabrica(Garantia garantia) {
        return "Garantia aprovada: " + super.obterRespostaFabrica(garantia);
    }
}
