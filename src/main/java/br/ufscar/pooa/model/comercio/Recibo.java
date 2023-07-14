package br.ufscar.pooa.model.comercio;

public class Recibo {
  private Long id;
  private Venda venda;

  public Recibo(Long id, Venda venda) {
    this.id = id;
    this.venda = venda;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Recibo{" +
        "id=" + id +
        ", venda=" + venda +
        '}';
  }
}
