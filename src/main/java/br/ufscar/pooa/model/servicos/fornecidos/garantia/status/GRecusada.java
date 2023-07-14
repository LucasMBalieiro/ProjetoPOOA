package br.ufscar.pooa.model.servicos.fornecidos.garantia.status;

import br.ufscar.pooa.model.servicos.fornecidos.garantia.Garantia;

public class GRecusada extends StatusGarantia {
    @Override
    public String obterRespostaFabrica(Garantia garantia) {
        return "Garantia reprovada: " + super.obterRespostaFabrica(garantia);
    }
}
