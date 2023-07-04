package br.ufscar.pooa.model.servicos;

import br.ufscar.pooa.model.pessoas.Cliente;

import java.time.LocalDate;
import java.util.List;

public class OrdemDeServico {
  private int id;
  private LocalDate dataEntrada;
  private Cliente cliente;
  private List<EquipamentoCliente> equipamentos;
  private String defeitosReclamados;

  public OrdemDeServico(int id, LocalDate dataEntrada, Cliente cliente, List<EquipamentoCliente> equipamentos, String defeitosReclamados) {
    this.id = id;
    this.dataEntrada = dataEntrada;
    this.cliente = cliente;
    this.equipamentos = equipamentos;
    this.defeitosReclamados = defeitosReclamados;
  }


}
