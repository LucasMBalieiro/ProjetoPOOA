package br.ufscar.pooa.model.servicos.servico;

import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.EquipamentoCliente;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.servico.status.StatusServico;

import java.time.LocalDate;
import java.util.List;

public class Servico {
  private String nome;
  private Cliente cliente;
  private EquipamentoCliente equipamento;
  private Venda daVenda;
  private LocalDate dataInicio;
  private Funcionario responsavel;
  private List<ServicoFornecido> servicos;
  private StatusServico status;
  private double valor;
  private String laudo;

  public Servico(String nome,
                 Cliente cliente,
                 EquipamentoCliente equipamento,
                 Venda daVenda,
                 LocalDate dataInicio,
                 Funcionario responsavel,
                 List<ServicoFornecido> servicos,
                 StatusServico status,
                 double valor,
                 String laudo) {
    this.nome = nome;
    this.cliente = cliente;
    this.equipamento = equipamento;
    this.daVenda = daVenda;
    this.dataInicio = dataInicio;
    this.responsavel = responsavel;
    this.servicos = servicos;
    this.status = status;
    this.valor = valor;
    this.laudo = laudo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public EquipamentoCliente getEquipamento() {
    return equipamento;
  }

  public void setEquipamento(EquipamentoCliente equipamento) {
    this.equipamento = equipamento;
  }

  public Venda getDaVenda() {
    return daVenda;
  }

  public void setDaVenda(Venda daVenda) {
    this.daVenda = daVenda;
  }

  public LocalDate getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
  }

  public Funcionario getResponsavel() {
    return responsavel;
  }

  public void setResponsavel(Funcionario responsavel) {
    this.responsavel = responsavel;
  }

  public List<ServicoFornecido> getServicos() {
    return servicos;
  }

  public void setServicos(List<ServicoFornecido> servicos) {
    this.servicos = servicos;
  }

  public StatusServico getStatus() {
    return status;
  }

  public void setStatus(StatusServico status) {
    this.status = status;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getLaudo() {
    return laudo;
  }

  public void setLaudo(String laudo) {
    this.laudo = laudo;
  }

  public void aprovar() {

  }

  public void iniciar() {

  }

  public void cancelar() {

  }

  public void finalizar() {

  }

  public double calcularValor() {
    return 0;
  }

  public void adicionarServicoFornecido() {

  }

}
