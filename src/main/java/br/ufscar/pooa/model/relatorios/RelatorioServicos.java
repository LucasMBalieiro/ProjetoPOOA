package br.ufscar.pooa.model.relatorios;

import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;

import java.util.Date;
import java.util.ArrayList;
public class RelatorioServicos extends Relatorio {
    private ArrayList<ServicoFornecido> servicos;

    public RelatorioServicos(Date data, String descricao, String conteudo) {
        super(data, descricao, conteudo);
        this.servicos = new ArrayList<ServicoFornecido>();
    }

    public void adicionarServico(ServicoFornecido servico) {
        servicos.add(servico);
    }
}