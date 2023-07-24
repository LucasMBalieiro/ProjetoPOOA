package br.ufscar.pooa.model.pdfs;

import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.kernel.pdf.PdfDocument;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class GeradorPdf {
  protected String caminhoBaseTemplates = "src/main/resources/pdfs/templates/";
  protected String caminhoBaseResultados = "src/main/resources/pdfs/results/";
  protected String caminhoPdfGerado;

  public String gerar() throws IOException {
    PdfDocument pdfDocument = this.abrirDocumento();

    PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDocument, true);
    form.setGenerateAppearance(true);

    this.preencherCampos(form);

    form.flattenFields();

    pdfDocument.close();

    return this.getCaminhoPdfGerado();
  }

  protected String getCaminhoPdfGerado() {
    return this.caminhoPdfGerado;
  }

  protected abstract PdfDocument abrirDocumento() throws IOException;

  protected abstract void preencherCampos(PdfAcroForm form);

}
