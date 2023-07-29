package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.servicos.OrdemDeServico;
import com.itextpdf.forms.PdfAcroForm;

public class GeradorOrdemDeServico extends GeradorPdf {
  private final OrdemDeServico ordem;

  public GeradorOrdemDeServico(OrdemDeServico ordem) {
    super(ordem);
    this.ordem = ordem;
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
