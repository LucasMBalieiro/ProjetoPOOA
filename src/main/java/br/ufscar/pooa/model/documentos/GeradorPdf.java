package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.documentos.Documento;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class GeradorPdf {
  protected Documento documento;

  public GeradorPdf(Documento documento) {
    this.documento = documento;
  }

  public String gerar() throws IOException {
    String caminhoBaseResultados = "src/main/resources/pdfs/results/";
    String caminhoPdfGerado = caminhoBaseResultados + this.montarNomePdfGerado(documento);
    String caminhoBaseTemplates = "src/main/resources/pdfs/templates/";
    String caminhoPdfTemplate = caminhoBaseTemplates + this.montarNomePdfTemplate(documento);

    PdfReader reader = new PdfReader(caminhoPdfTemplate);
    PdfWriter writer = new PdfWriter(caminhoPdfGerado);

    PdfDocument pdfDocument = new PdfDocument(reader, writer);

    PdfAcroForm form = PdfAcroForm.getAcroForm(pdfDocument, true);
    form.setGenerateAppearance(true);

    this.preencherCampos(form);

    form.flattenFields();

    pdfDocument.close();

    return caminhoPdfGerado;
  }

//  protected abstract PdfDocument abrirDocumento() throws IOException;

  protected abstract void preencherCampos(PdfAcroForm form);

  private String montarNomePdfGerado(Documento documento) {
    return documento.getNome() + "-" + documento.getData() + "-" + documento.getId() + ".pdf";
  }

  private String montarNomePdfTemplate(Documento documento) {
    return documento.getNome() + ".pdf";
  }
}
