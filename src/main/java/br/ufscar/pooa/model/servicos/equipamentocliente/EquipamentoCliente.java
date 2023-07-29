package br.ufscar.pooa.model.servicos.equipamentocliente;

import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.servicos.EquipamentoAceitoParaServico;
import br.ufscar.pooa.model.servicos.equipamentocliente.status.EEmAnalise;
import br.ufscar.pooa.model.servicos.equipamentocliente.status.StatusEquipamento;
import br.ufscar.pooa.model.servicos.servico.Servico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoCliente {
  private Long id;
  private Cliente cliente;
  private LocalDate dataChegada;
  private EquipamentoAceitoParaServico tipo;
  private StatusEquipamento status;
  private List<Servico> servicos;

  public EquipamentoCliente(Cliente cliente, LocalDate dataChegada, EquipamentoAceitoParaServico tipo) {
    this.cliente = cliente;
    this.dataChegada = dataChegada;
    this.tipo = tipo;
    this.status = new EEmAnalise();
    this.servicos = new ArrayList<>();
  }

  public EquipamentoCliente(Cliente cliente, LocalDate dataChegada, EquipamentoAceitoParaServico tipo, StatusEquipamento status) {
    this.cliente = cliente;
    this.dataChegada = dataChegada;
    this.tipo = tipo;
    this.status = status;
    this.servicos = new ArrayList<>();
  }

  public void iniciarManutencao() {
    status.iniciarManutencao(this);
  }

  public void iniciarColeta() {
    status.iniciarColeta(this);
  }

  public void entregar() {
    if (osServicosEstaoPagos())
      status.entregar(this);
    else
      throw new RuntimeException("Não é possível entregar um equipamento com serviços não pagos");
  }

  private boolean osServicosEstaoPagos() {
    for (Servico servico : servicos) {
      if (!servico.estaPago()) {
        return false;
      }
    }
    return true;
  }

  public void setStatus(StatusEquipamento status) {
    this.status = status;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public LocalDate getDataChegada() {
    return dataChegada;
  }

  public void setDataChegada(LocalDate dataChegada) {
    this.dataChegada = dataChegada;
  }

  public EquipamentoAceitoParaServico getTipo() {
    return tipo;
  }

  public void setTipo(EquipamentoAceitoParaServico tipo) {
    this.tipo = tipo;
  }

  public StatusEquipamento getStatus() {
    return status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Servico> getServicos() {
    return servicos;
  }

  public void adiconarServico(Servico servico) {
    this.servicos.add(servico);
  }

  @Override
  public String toString() {
    return "EquipamentoCliente{" +
        "id=" + id +
        ", cliente=" + cliente.getNome() +
        ", dataChegada=" + dataChegada +
        ", tipo=" + tipo +
        ", status=" + status +
        ", servicos=" + servicos +
        '}';
  }
}
