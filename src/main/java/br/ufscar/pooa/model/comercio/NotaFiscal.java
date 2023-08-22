package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.documentos.Documento;
import br.ufscar.pooa.model.documentos.GeradorNotaFiscal;
import br.ufscar.pooa.model.pessoas.Cliente;

public class NotaFiscal extends Documento {
    private String naturezaDaOperação;
    private double valorDeImpostos;
    private Venda venda;

    public NotaFiscal(Long id, String naturezaDaOperacao, double valorDeImpostos, Venda venda) {
        super(id, "recibo");

        this.naturezaDaOperação = naturezaDaOperacao;
        this.valorDeImpostos = valorDeImpostos;
        this.venda = venda;
        this.geradorPdf = new GeradorNotaFiscal(this);
    }

    public String getNaturezaDaOperação() { return this.naturezaDaOperação; }
    public double getValorDeImpostos() { return this.valorDeImpostos; }
    public Venda getVenda() {
        return venda;
    }

    public void setValorDeImpostos(double valorDeImpostos) { this.valorDeImpostos = valorDeImpostos; }
    public void setNaturezaDaOperação(String naturezaDaOperação) { this.naturezaDaOperação = naturezaDaOperação; }
    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public void emitir() {
        System.out.println("Nota Fiscal emitida!");
    }

    public Cliente getCliente() {
        return this.venda.getCliente();
    }

    @Override
    public String toString() {
        return "NotaFiscal{" +
                "id=" + this.getId() +
                ", naturezaDaOperacao=" + this.getNaturezaDaOperação() +
                ", valorDeImpostos=" + this.getValorDeImpostos() +
                ", venda=" + venda +
                '}';
    }
}
