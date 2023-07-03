package br.ufscar.pooa.model.relatorios;
import java.util.Date;

public class Relatorio {
    private Date data;
    private String descricao;
    private String conteudo;

    public Relatorio(Date data, String descricao, String conteudo) {
        this.data = data;
        this.descricao = descricao;
        this.conteudo = conteudo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}