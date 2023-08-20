package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.Recibo;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeradorRecibo extends GeradorPdf {
  private final Recibo recibo;


  public GeradorRecibo(Recibo recibo) {
    super(recibo);

    this.recibo = recibo;
  }

//  @Override
//  protected PdfDocument abrirDocumento() throws IOException {
//    PdfReader reader = new PdfReader(this.caminhoBaseTemplates + this.recibo.getTemplate() + ".pdf");
//    PdfWriter writer = new PdfWriter(this.caminhoPdfGerado);
//
//    return new PdfDocument(reader, writer);
//  }

  @Override
  protected void preencherCampos(PdfAcroForm form) {

    Map<String, String> dados = new HashMap<>();

    Cliente cliente = recibo.getCliente();
    if (cliente == null) {
      dados.put("Cliente", "Não informado");
    } else {
      dados.put("Cliente", cliente.getNome());
    }

    dados.put("Data", recibo.getData().toString());

    Venda venda = recibo.getVenda();
    List<Item> itens = venda.getItens();


    int i = 1;
    for (Item item : itens) {
      dados.put("No_" + i, String.valueOf(item.getQuantidade()));
      dados.put("descricao_" + i, item.getProduto().getDescricao());
      dados.put("valor_" + i, String.valueOf(item.getProduto().getValor()));
      i++;
    }

    for (Map.Entry<String, String> entry : dados.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
      PdfFormField field = form.getField(key);
      if (field != null) {
        field.setValue(value);
      }
    }

    form.flattenFields();
  }
}
