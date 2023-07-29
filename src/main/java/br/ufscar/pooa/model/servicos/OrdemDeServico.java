package br.ufscar.pooa.model.servicos;

import br.ufscar.pooa.model.documentos.Documento;
import br.ufscar.pooa.model.documentos.GeradorOrdemDeServico;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.time.LocalDate;
import java.util.List;

public class OrdemDeServico extends Documento {
  private Cliente cliente;
  private List<EquipamentoCliente> equipamentos;
  private String defeitosReclamados;

  public OrdemDeServico(Long id, Cliente cliente, List<EquipamentoCliente> equipamentos, String defeitosReclamados) {
    super(id, "ordem_de_servico");

    this.cliente = cliente;
    this.equipamentos = equipamentos;
    this.defeitosReclamados = defeitosReclamados;
    this.geradorPdf = new GeradorOrdemDeServico(this);
  }

  public OrdemDeServico(Long id, LocalDate dataEntrada, Cliente cliente, List<EquipamentoCliente> equipamentos, String defeitosReclamados) {
    super(id, "ordem_de_servico", dataEntrada);

    this.cliente = cliente;
    this.equipamentos = equipamentos;
    this.defeitosReclamados = defeitosReclamados;
    this.geradorPdf = new GeradorOrdemDeServico(this);
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
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
        "id=" + this.getId() +
        ", dataEntrada=" + this.getData() +
        ", equipamentos=" + equipamentos +
        ", defeitosReclamados='" + defeitosReclamados + '\'' +
        '}';
  }
}
