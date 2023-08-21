package br.ufscar.pooa.model.documentos;

import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.NotaFiscal;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import com.itextpdf.forms.PdfAcroForm;
import com.itextpdf.forms.fields.PdfFormField;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeradorNotaFiscal extends GeradorPdf {
    private final NotaFiscal notaFiscal;

    public GeradorNotaFiscal(NotaFiscal notaFiscal) {
        super(notaFiscal);

        this.notaFiscal = notaFiscal;
    }

    @Override
    protected void preencherCampos(PdfAcroForm form) {
        Map<String, String> dados = new HashMap<>();

        Cliente cliente = notaFiscal.getCliente();
        dados.put("Cliente", cliente.getNome());

        dados.put("Data", notaFiscal.getData().toString());

        Venda venda = notaFiscal.getVenda();
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
