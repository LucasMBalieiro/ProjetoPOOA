package br.ufscar.pooa.model.pdfs;

import java.io.IOException;

public class GeradorPdfService {
  private GeradorPdf geradorPdf;

  public GeradorPdfService(GeradorPdf geradorPdf) {
    this.geradorPdf = geradorPdf;
  }

  public String gerar() throws IOException {
    return this.geradorPdf.gerar();
  }
}
