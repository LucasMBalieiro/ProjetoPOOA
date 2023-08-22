package br.ufscar.pooa;

import br.ufscar.pooa.model.BDSimulado;
import br.ufscar.pooa.model.armazenamento.estoque.Estoque;
import br.ufscar.pooa.model.armazenamento.estoque.IEstoque;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Equipamento;
import br.ufscar.pooa.model.comercio.*;
import br.ufscar.pooa.model.comercio.descontos.DescontoPorMetodoDePagamentoAVista;
import br.ufscar.pooa.model.pessoas.Cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendaDeEquipamentoMain {
  public static void main(String[] args) throws IOException {
    System.out.println("Populando o banco de dados simulado...");
    PopulaDBMain.main(args);

    System.out.println("Listando itens do estoque...");
    IEstoque estoque = Estoque.getInstancia();
    estoque.getItens().forEach(System.out::println);

    System.out.println("Listando clientes...");
    BDSimulado bdSimulado = BDSimulado.getInstancia();
    bdSimulado.getClientes().forEach(System.out::println);

    System.out.println("Vendendo equipamento...");

    // Pegando o primeiro equipamento do estoque
    Produto equipamentoParaVenda = null;
    for (int i = 0; i < estoque.getItens().size(); i++) {
      Object objeto = estoque.getItens().toArray()[i];
      if (objeto instanceof Equipamento) {
        equipamentoParaVenda = (Produto) estoque.getItens().toArray()[i];
      }
    }

    System.out.println("Equipamento para venda: " + equipamentoParaVenda);

    // Criando um item de venda com o equipamento
    Item itemDeVenda = new Item(equipamentoParaVenda, 1);

    System.out.println("Item de venda: " + itemDeVenda);

    // Pegando o primeiro cliente do banco de dados simulado
    Cliente cliente = bdSimulado.getClientes().stream().findFirst().get();

    System.out.println("Cliente: " + cliente);

    // Criando uma venda com o item de venda
    Venda venda = new Venda(
        Arrays.asList(itemDeVenda),
        cliente
    );

    System.out.println("Venda: " + venda);

    // Adicionando a venda ao banco de dados simulado
    bdSimulado.saveVenda(venda);

    System.out.println("Venda adicionada ao banco de dados simulado!");

    // Pagando venda
    Pagamento pagamento = new GeradorDePagamento(
        List.of(new DescontoPorMetodoDePagamentoAVista())
    ).gerarPagamento(venda, "Dinheiro");

    pagamento.pagar();

    System.out.println("Pagamento " + pagamento + " realizado com sucesso!");

    System.out.println("Listando itens do estoque...");
    estoque.getItens().forEach(System.out::println);

    System.out.println("Gerando recibo...");
    Recibo recibo = new Recibo(21L, venda);
    recibo.gerar();

    // Gerando a NF-e (Nota Fiscal Eletrônica)
    System.out.println("Gerando nota fiscal...");
    NotaFiscal notaFiscal = new NotaFiscal(20L, "Venda Usuário Final", 0.20, venda);
    notaFiscal.gerar();
  }
}
