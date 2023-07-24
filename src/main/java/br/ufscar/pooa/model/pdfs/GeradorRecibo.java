package br.ufscar.pooa.model.pdfs;

import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.Recibo;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeradorRecibo extends GeradorPdf {
  private final Recibo recibo;


  public GeradorRecibo(Recibo recibo) {
    this.recibo = recibo;
    this.caminhoPdfGerado = this.caminhoBaseResultados + this.recibo.getTemplate() + "_filled.pdf";
  }

  @Override
  protected PdfDocument abrirDocumento() throws IOException {
    PdfReader reader = new PdfReader(this.caminhoBaseTemplates + this.recibo.getTemplate() + ".pdf");
    PdfWriter writer = new PdfWriter(this.caminhoPdfGerado);

    return new PdfDocument(reader, writer);
  }

  @Override
  protected void preencherCampos(PdfAcroForm form) {

    Map<String, String> dados = new HashMap<>();

    Cliente cliente = recibo.getCliente();
    dados.put("Cliente", cliente.getDadosPessoais().getNome());

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
