package br.ufscar.pooa.model.pdfs;

import br.ufscar.pooa.model.comercio.Orcamento;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.kernel.pdf.PdfDocument;

public class GeradorOrcamento extends GeradorPdf {
  private final Orcamento orcamento;

  public GeradorOrcamento(Orcamento orcamento) {
    this.orcamento = orcamento;
  }

  @Override
  protected PdfDocument abrirDocumento() {
    return null;
  }

  @Override
  protected void preencherCampos(PdfAcroForm form) {

//    Map<String, String> dados = new HashMap<>();
//
//
//
//    for (Map.Entry<String, String> entry : dados.entrySet()) {
//      String key = entry.getKey();
//      String value = entry.getValue();
//      PdfFormField field = form.getField(key);
//      if (field != null) {
//        field.setValue(value);
//      }
//    }
//
//    form.flattenFields();
  }
}
