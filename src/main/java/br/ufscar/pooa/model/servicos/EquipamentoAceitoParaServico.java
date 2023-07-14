package br.ufscar.pooa.model.servicos;

import java.util.List;

public class EquipamentoAceitoParaServico {
  private String marca;
  private String modelo;
  private List<String> etiquetas;
  private double valorDeMaoDeObra;
  private double valorDeEntregaTecnica;

  public EquipamentoAceitoParaServico(String marca, String modelo, List<String> etiquetas, double valorDeMaoDeObra, double valorDeEntregaTecnica) {
    this.marca = marca;
    this.modelo = modelo;
    this.etiquetas = etiquetas;
    this.valorDeMaoDeObra = valorDeMaoDeObra;
    this.valorDeEntregaTecnica = valorDeEntregaTecnica;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public List<String> getEtiquetas() {
    return etiquetas;
  }

  public void setEtiquetas(List<String> etiquetas) {
    this.etiquetas = etiquetas;
  }

  public double getValorDeMaoDeObra() {
    return valorDeMaoDeObra;
  }

  public void setValorDeMaoDeObra(double valorDeMaoDeObra) {
    this.valorDeMaoDeObra = valorDeMaoDeObra;
  }

  public double getValorDeEntregaTecnica() {
    return valorDeEntregaTecnica;
  }

  public void setValorDeEntregaTecnica(double valorDeEntregaTecnica) {
    this.valorDeEntregaTecnica = valorDeEntregaTecnica;
  }

  @Override
  public String toString() {
    return "EquipamentoAceitoParaServico{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", etiquetas=" + etiquetas +
        ", valorDeMaoDeObra=" + valorDeMaoDeObra +
        ", valorDeEntregaTecnica=" + valorDeEntregaTecnica +
        '}';
  }
}
