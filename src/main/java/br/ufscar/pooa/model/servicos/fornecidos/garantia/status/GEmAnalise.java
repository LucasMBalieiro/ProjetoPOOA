package br.ufscar.pooa.model.servicos.fornecidos.garantia.status;

import br.ufscar.pooa.model.servicos.fornecidos.garantia.Garantia;

public class GEmAnalise extends StatusGarantia {
    @Override
    public void aprovar(Garantia garantia) {
        garantia.setStatus(new GAprovada());
    }

    @Override
    public void reprovar(Garantia garantia) {
        garantia.setStatus(new GRecusada());
    }
}
