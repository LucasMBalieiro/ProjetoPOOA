package br.ufscar.pooa.model.servicos;

import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.time.LocalDate;
import java.util.List;

public class OrdemDeServico {
  private long id;
  private LocalDate dataEntrada;
  private List<EquipamentoCliente> equipamentos;
  private String defeitosReclamados;

  public OrdemDeServico(long id, LocalDate dataEntrada, List<EquipamentoCliente> equipamentos, String defeitosReclamados) {
    this.id = id;
    this.dataEntrada = dataEntrada;
    this.equipamentos = equipamentos;
    this.defeitosReclamados = defeitosReclamados;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public LocalDate getDataEntrada() {
    return dataEntrada;
  }

  public void setDataEntrada(LocalDate dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  public List<EquipamentoCliente> getEquipamentos() {
    return equipamentos;
  }

  public void setEquipamentos(List<EquipamentoCliente> equipamentos) {
    this.equipamentos = equipamentos;
  }

  public String getDefeitosReclamados() {
    return defeitosReclamados;
  }

  public void setDefeitosReclamados(String defeitosReclamados) {
    this.defeitosReclamados = defeitosReclamados;
  }

  @Override
  public String toString() {
    return "OrdemDeServico{" +
        "id=" + id +
        ", dataEntrada=" + dataEntrada +
        ", equipamentos=" + equipamentos +
        ", defeitosReclamados='" + defeitosReclamados + '\'' +
        '}';
  }
}
