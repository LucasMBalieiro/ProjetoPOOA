package br.ufscar.pooa.model.servicos;

import java.time.LocalDate;
import java.util.List;

public class OrdemDeServico {
  private int id;
  private LocalDate dataEntrada;
  private Cliente cliente;
  private List<EquipamentoCliente> equipamentos;
  private String defeitosReclamados;
}
