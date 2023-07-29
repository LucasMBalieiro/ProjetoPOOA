package br.ufscar.pooa.model.armazenamento;

import br.ufscar.pooa.model.armazenamento.estoque.Estoque;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.*;

public class Deposito implements IDeposito {
  private static Deposito instancia;
  private Set<EquipamentoCliente> equipamentosClientes;

  private Deposito() {
    // inicializacoes
    this.equipamentosClientes = new HashSet<>();
  }

  public static synchronized Deposito getInstancia() {
    if (Deposito.instancia == null) {
      Deposito.instancia = new Deposito();
    }

    return Deposito.instancia;
  }

  @Override
  public void removerEquipamento(EquipamentoCliente equipamentoCliente) {
    equipamentosClientes.remove(equipamentoCliente);
  }

  @Override
  public void adicionarEquipamento(EquipamentoCliente equipamentoCliente) {
    equipamentosClientes.add(equipamentoCliente);
  }

  @Override
  public void atualizarEquipamento(EquipamentoCliente equipamentoCliente) {
    this.removerEquipamento(equipamentoCliente);
    this.adicionarEquipamento(equipamentoCliente);
  }

  @Override
  public Set<EquipamentoCliente> listarEquipamentos() {
    return equipamentosClientes;
  }

  @Override
  public Set<EquipamentoCliente> listarEquipamentosPorCliente(Cliente cliente) {
    Set<EquipamentoCliente> equipamentosDoCliente = new HashSet<>();

    equipamentosClientes.forEach(e -> {
      if (e.getCliente().equals(cliente)) {
        equipamentosDoCliente.add(e);
      }
    });

    return equipamentosDoCliente;
  }

  @Override
  public Set<Cliente> listarClientesComEquipamentoArmazenado() {
    Set<Cliente> clientes = new HashSet<>();

    equipamentosClientes.forEach(e -> {
      clientes.add(e.getCliente());
    });

    return clientes;
  }
}
