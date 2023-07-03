package br.ufscar.pooa.model.relatorios;

import br.ufscar.pooa.model.comercio.Venda;

import java.util.Date;
import java.util.ArrayList;

public class RelatorioVendas extends Relatorio {
    private ArrayList<Venda> vendas;

    public RelatorioVendas(Date data, String descricao, String conteudo) {
        super(data, descricao, conteudo);
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }
}