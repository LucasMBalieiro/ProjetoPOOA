package br.ufscar.pooa.model.documentos;

import java.io.IOException;
import java.time.LocalDate;

public abstract class Documento {
  private Long id;
  private String nome;
  private LocalDate data;
  protected GeradorPdf geradorPdf;

  public Documento(Long id, String nome) {
    this.id = id;
    this.nome = nome;
    this.data = LocalDate.now();
  }

  public Documento(Long id, String nome, LocalDate data) {
    this.id = id;
    this.nome = nome;
    this.data = data;
  }

  public Documento(Long id, String nome, GeradorPdf geradorPdf) {
    this.id = id;
    this.nome = nome;
    this.geradorPdf = geradorPdf;
    this.data = LocalDate.now();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  public GeradorPdf getGeradorPdf() {
    return geradorPdf;
  }

  public void setGeradorPdf(GeradorPdf geradorPdf) {
    this.geradorPdf = geradorPdf;
  }

  public String gerar() throws IOException {
    return this.getGeradorPdf().gerar();
  }
}
