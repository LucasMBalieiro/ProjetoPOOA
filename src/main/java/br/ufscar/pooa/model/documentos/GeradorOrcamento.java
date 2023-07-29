package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.comercio.Orcamento;
import com.itextpdf.forms.PdfAcroForm;

public class GeradorOrcamento extends GeradorPdf {
  private final Orcamento orcamento;

  public GeradorOrcamento(Orcamento orcamento) {
    super(orcamento);
    this.orcamento = orcamento;
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
