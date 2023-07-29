package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.documentos.Documento;
import br.ufscar.pooa.model.documentos.GeradorRecibo;
import br.ufscar.pooa.model.pessoas.Cliente;

public class Recibo extends Documento {
  private Venda venda;

  public Recibo(Long id, Venda venda) {
    super(id, "recibo");

    this.venda = venda;
    this.geradorPdf = new GeradorRecibo(this);
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }

  public void emitir() {
    System.out.println("Recibo emitido!");
  }

  public Cliente getCliente() {
    return this.venda.getCliente();
  }


  @Override
  public String toString() {
    return "Recibo{" +
        "id=" + this.getId() +
        ", venda=" + venda +
        '}';
  }
}
