package br.ufscar.pooa;

import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.Recibo;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.deposito.estoque.itens.Equipamento;
import br.ufscar.pooa.model.deposito.estoque.itens.Peca;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.DadosPessoais;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.OrdemDeServico;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.fornecidos.TrocaDePeca;
import br.ufscar.pooa.model.servicos.laudo.LaudoTecnico;
import br.ufscar.pooa.model.servicos.laudo.Recomendacao;
import br.ufscar.pooa.model.servicos.servico.Servico;
import br.ufscar.pooa.model.servicos.servico.status.Aprovado;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ServicosMain {
  public static void main(String[] args) {
    System.out.println("Aplicacao iniciada...");
    EquipamentoAceitoParaServico equipamentoAceitoParaServico = new EquipamentoAceitoParaServico(
        "Toyama",
        "Gerador Toyama TG2800CX",
        Arrays.asList("Gerador", "Gasolina"),
        200.00,
        50.00
    );

    System.out.println("Equipamento aceito para servico: " + equipamentoAceitoParaServico);

    Cliente cliente = new Cliente(
        "12345678910",
        new DadosPessoais(
            "Joao",
            "123456789",
            "(82) 99999-9999",
            "joao@joao.com"
        )
    );

    EquipamentoCliente equipamentoCliente = new EquipamentoCliente(
        cliente,
        LocalDate.now(),
        equipamentoAceitoParaServico
    );

    System.out.println("Cliente: " + cliente);
    System.out.println("Equipamento cliente: " + equipamentoCliente);

    OrdemDeServico ordemDeServico = new OrdemDeServico(
        2000,
        LocalDate.now(),
        Arrays.asList(equipamentoCliente),
        "Defeito reclamado"
    );

    System.out.println("Ordem de servico: " + ordemDeServico);

    System.out.println("Populando o estoque...");

    Equipamento equipamento = new Equipamento(
        12223212,
        "Toyama",
        "Gerador Toyama TG2800CX",
        0,
        2000.00,
        Arrays.asList("Gerador", "Gasolina")

    );

    Peca filtroDeAr = new Peca(
        12223212,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800CXXX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        null
    );

    Peca filtroDeAr2 = new Peca(
        1222321211,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800CX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        Arrays.asList(equipamento)
    );

    System.out.println("Populando os serviços fornecidos...");

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

    Funcionario funcionario = new Funcionario(
        "joao",
        "12345",
        new DadosPessoais(
            "Joao da silva",
            "123456789",
            "(82) 99999-9999",
            "joao@joao.com"
        )
    );

    System.out.println("Funcionario: " + funcionario);

    System.out.println("Criando um laudo tecnico...");

    LaudoTecnico laudoTecnico = new LaudoTecnico(
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

    Venda venda = new Venda(
        null,
        cliente,
        Arrays.asList(
            servico
        )
    );

    System.out.println("Venda: " + venda);

    venda.pagar();
    Recibo recibo = new Recibo(1L, venda);

    System.out.println("Venda: " + venda);
    System.out.println("Recibo: " + recibo);

    equipamentoCliente.entregar();

    System.out.println("Equipamento cliente: " + equipamentoCliente);
    System.out.println("Servico: " + servico);
  }
}
