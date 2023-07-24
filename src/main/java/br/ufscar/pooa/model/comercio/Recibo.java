package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.pessoas.Cliente;

import java.time.LocalDate;

public class Recibo {
  private Long id;
  private Venda venda;
  private String template;
  private LocalDate data;

  public Recibo(Long id, Venda venda) {
    this.id = id;
    this.venda = venda;
    this.template = "recibo";
    this.data = LocalDate.now();
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

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public Cliente getCliente() {
    return this.venda.getCliente();
  }


  @Override
  public String toString() {
    return "Recibo{" +
        "id=" + id +
        ", venda=" + venda +
        '}';
  }
}
