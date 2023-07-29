package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.servicos.laudo.LaudoTecnico;
import com.itextpdf.forms.PdfAcroForm;

public class GeradorLaudoTecnico extends GeradorPdf {
  private final LaudoTecnico laudo;

  public GeradorLaudoTecnico(LaudoTecnico laudo) {
    super(laudo);
    this.laudo = laudo;
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
