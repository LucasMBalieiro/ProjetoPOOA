package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.Recibo;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.comercio.descontos.DescontoDePagamento;
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

    List<DescontoDePagamento> descontos = venda.getPagamento().getDescontos();

    int j = 1;
    for (DescontoDePagamento desconto : descontos) {
      dados.put("desconto_" + j, desconto.getNome());
      dados.put("porcentagem_" + j, String.valueOf(desconto.getPercentualDesconto()));
      dados.put("valordesconto_" + j, String.valueOf(desconto.getValorDesconto()));
      j++;
    }

    dados.put("valorfinal", String.valueOf(venda.getPagamento().getTotal()));
    dados.put("metodo", venda.getPagamento().getMetodo());


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
