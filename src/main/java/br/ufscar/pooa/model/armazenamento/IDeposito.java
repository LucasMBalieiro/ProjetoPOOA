package br.ufscar.pooa.model.armazenamento;

import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IDeposito {
  public void removerEquipamento(EquipamentoCliente equipamentoCliente);

  public void adicionarEquipamento(EquipamentoCliente equipamentoCliente);

  public void atualizarEquipamento(EquipamentoCliente equipamentoCliente);

  public Set<EquipamentoCliente> listarEquipamentos();

  public Set<EquipamentoCliente> listarEquipamentosPorCliente(Cliente cliente);

  public Set<Cliente> listarClientesComEquipamentoArmazenado();
}
