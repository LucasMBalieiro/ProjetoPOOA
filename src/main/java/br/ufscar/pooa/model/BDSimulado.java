package br.ufscar.pooa.model;

import br.ufscar.pooa.model.armazenamento.Deposito;
import br.ufscar.pooa.model.armazenamento.estoque.Estoque;
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
import br.ufscar.pooa.model.servicos.laudo.LaudoTecnico;
import br.ufscar.pooa.model.servicos.servico.Servico;

import java.util.HashSet;
import java.util.Set;

public class BDSimulado {
  private static BDSimulado instancia;

  private final Set<EquipamentoAceitoParaServico> equipamentosAceitosParaServico;
  private final Set<EquipamentoCliente> equipamentosClientes;
  private final Set<Equipamento> equipamentos;
  private final Set<OrdemDeServico> ordensDeServico;
  private final Set<ServicoFornecido> servicosFornecidos;
  private final Set<Funcionario> funcionarios;
  private final Set<LaudoTecnico> laudosTecnicos;
  private final Set<Servico> servicos;
  private final Set<Peca> pecas;
  private final Set<Item> itens;
  private final Set<Venda> vendas;
  private final Set<Cliente> clientes;
  private final Set<Recibo> recibos;
  private final Estoque estoque;
  private final Deposito deposito;


  private BDSimulado() {
    this.equipamentosAceitosParaServico = new HashSet<>();
    this.equipamentosClientes = new HashSet<>();
    this.ordensDeServico = new HashSet<>();
    this.servicosFornecidos = new HashSet<>();
    this.funcionarios = new HashSet<>();
    this.laudosTecnicos = new HashSet<>();
    this.servicos = new HashSet<>();
    this.itens = new HashSet<>();
    this.vendas = new HashSet<>();
    this.clientes = new HashSet<>();
    this.recibos = new HashSet<>();
    this.equipamentos = new HashSet<>();
    this.pecas = new HashSet<>();
    this.estoque = Estoque.getInstancia();
    this.deposito = Deposito.getInstancia();
  }

  public static BDSimulado getInstancia() {
    if (instancia == null) {
      instancia = new BDSimulado();
    }

    return instancia;
  }

  public boolean saveEquipamentoAceitoParaServico(EquipamentoAceitoParaServico equipamentoAceitoParaServico) {
    return this.equipamentosAceitosParaServico.add(equipamentoAceitoParaServico);
  }

  public boolean saveEquipamentoCliente(EquipamentoCliente equipamentoCliente) {
    return this.equipamentosClientes.add(equipamentoCliente);
  }

  public boolean saveOrdemDeServico(OrdemDeServico ordemDeServico) {
    return this.ordensDeServico.add(ordemDeServico);
  }

  public boolean saveServicoFornecido(ServicoFornecido servicoFornecido) {
    return this.servicosFornecidos.add(servicoFornecido);
  }

  public boolean saveFuncionario(Funcionario funcionario) {
    return this.funcionarios.add(funcionario);
  }

  public boolean saveLaudoTecnico(LaudoTecnico laudoTecnico) {
    return this.laudosTecnicos.add(laudoTecnico);
  }

  public boolean saveServico(Servico servico) {
    return this.servicos.add(servico);
  }

  public boolean saveItem(Item item) {
    return this.itens.add(item);
  }

  public boolean saveVenda(Venda venda) {
    return this.vendas.add(venda);
  }

  public boolean saveCliente(Cliente cliente) {
    return this.clientes.add(cliente);
  }

  public boolean saveRecibo(Recibo recibo) {
    return this.recibos.add(recibo);
  }

  public boolean saveEquipamento(Equipamento equipamento) {
    return this.equipamentos.add(equipamento);
  }

  public boolean savePeca(Peca peca) {
    return this.pecas.add(peca);
  }

  public boolean removeEquipamentoAceitoParaServico(EquipamentoAceitoParaServico equipamentoAceitoParaServico) {
    return this.equipamentosAceitosParaServico.remove(equipamentoAceitoParaServico);
  }

  public boolean removeEquipamentoCliente(EquipamentoCliente equipamentoCliente) {
    return this.equipamentosClientes.remove(equipamentoCliente);
  }

  public boolean removeOrdemDeServico(OrdemDeServico ordemDeServico) {
    return this.ordensDeServico.remove(ordemDeServico);
  }

  public boolean removeServicoFornecido(ServicoFornecido servicoFornecido) {
    return this.servicosFornecidos.remove(servicoFornecido);
  }

  public boolean removeFuncionario(Funcionario funcionario) {
    return this.funcionarios.remove(funcionario);
  }

  public boolean removeLaudoTecnico(LaudoTecnico laudoTecnico) {
    return this.laudosTecnicos.remove(laudoTecnico);
  }

  public boolean removeServico(Servico servico) {
    return this.servicos.remove(servico);
  }

  public boolean removeItem(Item item) {
    return this.itens.remove(item);
  }

  public boolean removeVenda(Venda venda) {
    return this.vendas.remove(venda);
  }

  public boolean removeCliente(Cliente cliente) {
    return this.clientes.remove(cliente);
  }

  public boolean removeRecibo(Recibo recibo) {
    return this.recibos.remove(recibo);
  }

  public boolean removeEquipamento(Equipamento equipamento) {
    return this.equipamentos.remove(equipamento);
  }

  public boolean removePeca(Peca peca) {
    return this.pecas.remove(peca);
  }

  public Set<EquipamentoAceitoParaServico> getEquipamentosAceitosParaServico() {
    return this.equipamentosAceitosParaServico;
  }

  public Set<EquipamentoCliente> getEquipamentosClientes() {
    return this.equipamentosClientes;
  }

  public Set<OrdemDeServico> getOrdensDeServico() {
    return this.ordensDeServico;
  }

  public Set<ServicoFornecido> getServicosFornecidos() {
    return this.servicosFornecidos;
  }

  public Set<Funcionario> getFuncionarios() {
    return this.funcionarios;
  }

  public Set<LaudoTecnico> getLaudosTecnicos() {
    return this.laudosTecnicos;
  }

  public Set<Servico> getServicos() {
    return this.servicos;
  }

  public Set<Item> getItens() {
    return this.itens;
  }

  public Set<Venda> getVendas() {
    return this.vendas;
  }

  public Set<Cliente> getClientes() {
    return this.clientes;
  }

  public Set<Recibo> getRecibos() {
    return this.recibos;
  }

}
