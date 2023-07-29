package br.ufscar.pooa;

import br.ufscar.pooa.model.BDSimulado;
import br.ufscar.pooa.model.armazenamento.Deposito;
import br.ufscar.pooa.model.armazenamento.IDeposito;
import br.ufscar.pooa.model.armazenamento.estoque.Estoque;
import br.ufscar.pooa.model.armazenamento.estoque.IEstoque;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Equipamento;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Peca;
import br.ufscar.pooa.model.comercio.Item;
import br.ufscar.pooa.model.comercio.Recibo;
import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.OrdemDeServico;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.fornecidos.TrocaDePeca;
import br.ufscar.pooa.model.servicos.laudo.LaudoTecnico;
import br.ufscar.pooa.model.servicos.laudo.Recomendacao;
import br.ufscar.pooa.model.servicos.servico.Servico;

import java.time.LocalDate;
import java.util.Arrays;

public class PopulaDBMain {
  public static void main(String[] args) {
    BDSimulado bdSimulado = BDSimulado.getInstancia();
    IEstoque estoque = Estoque.getInstancia();
    IDeposito deposito = Deposito.getInstancia();

    EquipamentoAceitoParaServico equipamentoAceitoParaServico1 = new EquipamentoAceitoParaServico(
        "Toyama",
        "Gerador Toyama TG2800CX",
        Arrays.asList("Gerador", "Gasolina"),
        200.00,
        50.00
    );

    EquipamentoAceitoParaServico equipamentoAceitoParaServico2 = new EquipamentoAceitoParaServico(
        "Tramontina",
        "Cortador de grama Tramontina CP32",
        Arrays.asList("Cortador de grama", "Elétrico"),
        50.00,
        0.00
    );

    bdSimulado.saveEquipamentoAceitoParaServico(equipamentoAceitoParaServico1);
    bdSimulado.saveEquipamentoAceitoParaServico(equipamentoAceitoParaServico2);

    Cliente cliente1 = new Cliente(
        "Joao",
        "000.000.000-00",
        "16999999999",
        "jao@jao.com",
        "Rua dos bobos, 0"
    );

    Cliente cliente2 = new Cliente(
        "Maria Joaquina",
        "111.111.111-11",
        "21999999999",
        "maria@maria.com",
        "Rua das bobas, 0"
    );

    bdSimulado.saveCliente(cliente1);
    bdSimulado.saveCliente(cliente2);

    EquipamentoCliente equipamentoCliente1 = new EquipamentoCliente(
        cliente1,
        LocalDate.now(),
        equipamentoAceitoParaServico1
    );

    EquipamentoCliente equipamentoCliente2 = new EquipamentoCliente(
        cliente2,
        LocalDate.now(),
        equipamentoAceitoParaServico2
    );

    deposito.adicionarEquipamento(equipamentoCliente1);
    deposito.adicionarEquipamento(equipamentoCliente2);
    bdSimulado.saveEquipamentoCliente(equipamentoCliente1);
    bdSimulado.saveEquipamentoCliente(equipamentoCliente2);

    OrdemDeServico ordemDeServico1 = new OrdemDeServico(
        2000L,
        cliente1,
        Arrays.asList(equipamentoCliente1),
        "Defeito reclamado pelo cliente 1"
    );

    OrdemDeServico ordemDeServico2 = new OrdemDeServico(
        2001L,
        cliente2,
        Arrays.asList(equipamentoCliente2),
        "Defeito reclamado pelo cliente 2"
    );

    bdSimulado.saveOrdemDeServico(ordemDeServico1);
    bdSimulado.saveOrdemDeServico(ordemDeServico2);

    Equipamento equipamento1 = new Equipamento(
        12223212,
        "Toyama",
        "Gerador Toyama TG2800CX",
        2,
        2000.00,
        Arrays.asList("Gerador", "Gasolina")
    );

    Equipamento equipamento2 = new Equipamento(
        12223213,
        "Tramontina",
        "Cortador de grama Tramontina CP32",
        2,
        2000.00,
        Arrays.asList("Cortador de grama", "Elétrico")
    );

    estoque.adicionarItem(equipamento1);
    estoque.adicionarItem(equipamento2);
    bdSimulado.saveEquipamento(equipamento1);
    bdSimulado.saveEquipamento(equipamento2);

    Peca peca1 = new Peca(
        12223212,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800",
        10,
        30.00,
        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        null
    );

    Peca peca2 = new Peca(
        12223213,
        "Tramontina",
        "Lâmina do Cortador de grama Tramontina CP32",
        10,
        30.00,
        Arrays.asList("Lâmina", "Cortador de grama", "Tramontina"),
        null
    );


    estoque.adicionarItem(peca1);
    estoque.adicionarItem(peca2);
    bdSimulado.savePeca(peca1);
    bdSimulado.savePeca(peca2);

    ServicoFornecido servicoFornecido1 = new TrocaDePeca(
        "Troca de filtro de ar",
        "Troca do filtro de ar do Gerador Toyama TG2800CX",
        Arrays.asList(
            peca1
        ),
        equipamentoAceitoParaServico1,
        150.00
    );

    ServicoFornecido servicoFornecido2 = new TrocaDePeca(
        "Troca de lâmina",
        "Troca da lâmina do Cortador de grama Tramontina CP32",
        Arrays.asList(
            peca2
        ),
        equipamentoAceitoParaServico2,
        150.00
    );

    bdSimulado.saveServicoFornecido(servicoFornecido1);
    bdSimulado.saveServicoFornecido(servicoFornecido2);

    Funcionario funcionario1 = new Funcionario(
        "Jose",
        "12345678910",
        "16999999999",
        "jose@jose",
        "Rua dos bobos, 0",
        "jose",
        "12345",
        false
    );

    Funcionario funcionario2 = new Funcionario(
        "Maria",
        "12345678911",
        "21999999999",
        "maria@maria",
        "Rua das bobas, 0",
        "maria",
        "12345",
        true
    );

    bdSimulado.saveFuncionario(funcionario1);
    bdSimulado.saveFuncionario(funcionario2);

    LaudoTecnico laudoTecnico1 = new LaudoTecnico(
        2001L,
        Arrays.asList(
            new Recomendacao(
                "Filtro de ar inutilizável",
                servicoFornecido1
            ),
            new Recomendacao(
                "Troca de óleo",
                servicoFornecido1
            )
        ),
        ordemDeServico1,
        equipamentoCliente1,
        "O equipamento está em perfeito estado, sem contar com o filtro danificado.",
        funcionario1
    );

    LaudoTecnico laudoTecnico2 = new LaudoTecnico(
        2002L,
        Arrays.asList(
            new Recomendacao(
                "Lâmina inutilizável",
                servicoFornecido2
            )
        ),
        ordemDeServico2,
        equipamentoCliente2,
        "O equipamento está em perfeito estado, sem contar com a lâmina danificada.",
        funcionario2
    );

    bdSimulado.saveLaudoTecnico(laudoTecnico1);
    bdSimulado.saveLaudoTecnico(laudoTecnico2);

    Servico servico1 = new Servico(
        "Manutencao Gerador Toyama TG2800CX",
        equipamentoCliente1,
        LocalDate.now(),
        funcionario1,
        Arrays.asList(
            servicoFornecido1
        )
    );

    Servico servico2 = new Servico(
        "Manutencao Cortador de grama Tramontina CP32",
        equipamentoCliente2,
        LocalDate.now(),
        funcionario2,
        Arrays.asList(
            servicoFornecido2
        )
    );

    bdSimulado.saveServico(servico1);
    bdSimulado.saveServico(servico2);

    Item item1 = new Item(
        peca1,
        2
    );

    Item item2 = new Item(
        peca2,
        1
    );

    bdSimulado.saveItem(item1);
    bdSimulado.saveItem(item2);

    Venda venda1 = new Venda(
        Arrays.asList(
            item1
        ),
        cliente1,
        Arrays.asList(
            servico1
        )
    );

    Venda venda2 = new Venda(
        Arrays.asList(
            item2
        ),
        cliente2,
        Arrays.asList(
            servico2
        )
    );

    bdSimulado.saveVenda(venda1);
    bdSimulado.saveVenda(venda2);

    Recibo recibo1 = new Recibo(2L, venda1);
    Recibo recibo2 = new Recibo(3L, venda2);

    bdSimulado.saveRecibo(recibo1);
    bdSimulado.saveRecibo(recibo2);

    System.out.println("Banco populado com sucesso!");
  }
}
