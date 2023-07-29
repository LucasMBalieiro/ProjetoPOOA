package br.ufscar.pooa.model.armazenamento.estoque.itens;


import java.util.List;

public class Equipamento extends ItemDeEstoque {
  private List<Peca> pecas;

  public Equipamento(long id, String marca, String modelo, int quantidadeEmEstoque, double valorDeVenda, List<String> etiquetas, List<Peca> pecas) {
    super(id, marca, modelo, quantidadeEmEstoque, valorDeVenda, etiquetas);
    this.pecas = pecas;
  }

  public Equipamento(long id, String marca, String modelo, int quantidadeEmEstoque, double valorDeVenda, List<String> etiquetas) {
    super(id, marca, modelo, quantidadeEmEstoque, valorDeVenda, etiquetas);
  }

  public List<Peca> getPecas() {
    return pecas;
  }

  public void adidionarPeca(Peca peca) {
    this.pecas.add(peca);
  }

  public void removerPeca(Peca peca) {
    this.pecas.remove(peca);
  }

  @Override
  public String toString() {
    return "Equipamento{" +
        "pecas=" + pecas +
        '}';
  }


}
