package br.ufscar.pooa;

import br.ufscar.pooa.model.armazenamento.Deposito;
import br.ufscar.pooa.model.armazenamento.IDeposito;
import br.ufscar.pooa.model.armazenamento.estoque.Estoque;
import br.ufscar.pooa.model.armazenamento.estoque.IEstoque;
import br.ufscar.pooa.model.comercio.*;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Equipamento;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Peca;
import br.ufscar.pooa.model.comercio.descontos.DescontoPorMetodoDePagamentoAVista;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.FactoryPessoa;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.OrdemDeServico;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.fornecidos.TrocaDePeca;
import br.ufscar.pooa.model.servicos.laudo.LaudoTecnico;
import br.ufscar.pooa.model.servicos.laudo.Recomendacao;
import br.ufscar.pooa.model.servicos.servico.Servico;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ServicoTrocaDePecasMain {
  public static void main(String[] args) {
    System.out.println("Aplicacao iniciada...");
    System.out.println("Populando o banco de dados simulado...");
    PopulaDBMain.main(args);

    EquipamentoAceitoParaServico equipamentoAceitoParaServico = new EquipamentoAceitoParaServico(
        "Toyama",
        "Gerador Toyama TG2800CX",
        Arrays.asList("Gerador", "Gasolina"),
        200.00,
        50.00
    );


    System.out.println("Equipamento aceito para servico: " + equipamentoAceitoParaServico);

    // Uso de Factory Method
    Cliente cliente = new FactoryPessoa().criarCliente(
        "Joao",
        "12345678910",
        "16999999999",
        "jao@jao.com",
        "Rua dos bobos, 0"
    );

    EquipamentoCliente equipamentoCliente = new EquipamentoCliente(
        cliente,
        LocalDate.now(),
        equipamentoAceitoParaServico
    );

    // Uso de Singleton e interface
    IDeposito deposito = Deposito.getInstancia();
    deposito.adicionarEquipamento(equipamentoCliente);

    System.out.println("Cliente: " + cliente);
    System.out.println("Equipamento cliente: " + equipamentoCliente);

    OrdemDeServico ordemDeServico = new OrdemDeServico(
        2000L,
        cliente,
        Arrays.asList(equipamentoCliente),
        "Defeito reclamado pelo cliente"
    );

    System.out.println("Ordem de servico: " + ordemDeServico);

    System.out.println("Populando o estoque...");

    // Uso de Singleton e interface
    IEstoque estoque = Estoque.getInstancia();

    Equipamento equipamento = new Equipamento(
        12223212,
        "Toyama",
        "Gerador Toyama TG2800CX",
        1,
        2000.00,
        Arrays.asList("Gerador", "Gasolina")
    );

    estoque.adicionarItem(equipamento);


    Peca filtroDeAr = new Peca(
        12223212,
        "Toyama",
        "Filtro de ar do Gerador Toyama XXXXXXX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        null
    );

    estoque.adicionarItem(filtroDeAr);

    Peca filtroDeAr2 = new Peca(
        1222321211,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800CX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        Arrays.asList(equipamento)
    );

    estoque.adicionarItem(filtroDeAr2);

    System.out.println("Populando os serviços fornecidos...");

    // Uso de hierarquia de classes e polimorfismo de métodos
    // ServicoFornecido é uma classe abstrata que possui métodos abstratos
    ServicoFornecido servicoFornecido = new TrocaDePeca(
        "Troca de filtro de ar",
        "Troca do filtro de ar do Gerador Toyama TG2800CX",
        Arrays.asList(
            filtroDeAr
        ),
        equipamentoAceitoParaServico,
        150.00
    );

    System.out.println("Servico fornecido: " + servicoFornecido);


    // Uso do Factory Method
    Funcionario funcionario = new FactoryPessoa().criarFuncionario(
        "Jose",
        "12345678910",
        "16999999999",
        "jose@jose",
        "Rua dos bobos, 0",
        "jose",
        "12345",
        false
    );

    System.out.println("Funcionario: " + funcionario);

    System.out.println("Criando um laudo tecnico...");

    LaudoTecnico laudoTecnico = new LaudoTecnico(
        2001L,
        Arrays.asList(
            new Recomendacao(
                "Filtro de ar inutilizável",
                servicoFornecido
            ),
            new Recomendacao(
                "Troca de óleo",
                servicoFornecido
            )
        ),
        ordemDeServico,
        equipamentoCliente,
        "O equipamento está em perfeito estado, sem contar com o filtro danificado.",
        funcionario
    );

    System.out.println("Laudo tecnico: " + laudoTecnico);

    Servico servico = new Servico(
        "Manutencao Gerador Toyama TG2800CX",
        equipamentoCliente,
        LocalDate.now(),
        funcionario,
        Arrays.asList(
            servicoFornecido
        )
    );

    System.out.println("Servico: " + servico);

    // Uso do State Pattern
    servico.iniciar();

    System.out.println("Servico: " + servico);

    servico.finalizar("Servico finalizado com sucesso, troca de filtro de ar");

    System.out.println("Servico: " + servico);
    System.out.println("Equipamento cliente: " + equipamentoCliente);

    try {
      equipamentoCliente.entregar();
    } catch (Exception e) {
      System.out.println("Erro ao entregar equipamento (sem pagamento): " + e.getMessage());
    }

    // Uso da interface Produto, que é implementada por Equipamento e Peca
    Item item = new Item(
        filtroDeAr,
        2
    );

    Item item1 = new Item(
        filtroDeAr2,
        3
    );

    System.out.println("Item: " + item);

    Venda venda = new Venda(
        Arrays.asList(
            item,
            item1
        ),
        cliente,
        Arrays.asList(
            servico
        )
    );

    System.out.println("Venda: " + venda);

    // Pagando venda
    Pagamento pagamento = new GeradorDePagamento(
        List.of(new DescontoPorMetodoDePagamentoAVista())
    ).gerarPagamento(venda, "PIX");

    pagamento.pagar();

    System.out.println("Pagamento " + pagamento + " realizado com sucesso!");

    Recibo recibo = new Recibo(22L, venda);

    System.out.println("Venda: " + venda);
    System.out.println("Recibo: " + recibo);

    String result = null;
    try {
      // Uso de Facade Pattern e Strategy Pattern
      result = recibo.gerar();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("PDF: " + result);

    equipamentoCliente.entregar();

    System.out.println("Equipamento cliente: " + equipamentoCliente);
    System.out.println("Servico: " + servico);
  }
}
