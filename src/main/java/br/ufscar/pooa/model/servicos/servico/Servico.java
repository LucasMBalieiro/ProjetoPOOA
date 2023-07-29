package br.ufscar.pooa.model.servicos.servico;

import br.ufscar.pooa.model.comercio.Venda;
import br.ufscar.pooa.model.pessoas.Cliente;
import br.ufscar.pooa.model.pessoas.Funcionario;
import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;
import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
import br.ufscar.pooa.model.servicos.servico.status.Aprovado;
import br.ufscar.pooa.model.servicos.servico.status.StatusServico;

import java.time.LocalDate;
import java.util.List;

public class Servico {
  private String nome;
  private EquipamentoCliente equipamento;
  private Venda daVenda;
  private LocalDate dataInicio;
  private Funcionario responsavel;
  private List<ServicoFornecido> servicos;
  private StatusServico status;
  private double valor;
  private String laudo;
  private boolean estaPago;

  public Servico(String nome,
                 EquipamentoCliente equipamento,
                 LocalDate dataInicio,
                 Funcionario responsavel,
                 List<ServicoFornecido> servicos) {
    this.nome = nome;
    this.equipamento = equipamento;
    this.dataInicio = dataInicio;
    this.responsavel = responsavel;
    this.servicos = servicos;

    this.daVenda = null; // busca se houve venda com esse equipamento
    this.equipamento.adiconarServico(this);
    this.equipamento.iniciarManutencao();
    this.status = new Aprovado();
    this.valor = this.calcularValorTotal();
    this.estaPago = false;
    System.out.println("Valor total: " + this.valor);

  }

  public Servico(String nome, EquipamentoCliente equipamento, Venda daVenda, LocalDate dataInicio, Funcionario responsavel, List<ServicoFornecido> servicos, StatusServico status, double valor, String laudo, boolean estaPago) {
    this.nome = nome;
    this.equipamento = equipamento;
    this.daVenda = daVenda;
    this.dataInicio = dataInicio;
    this.responsavel = responsavel;
    this.servicos = servicos;
    this.status = status;
    this.valor = valor;
    this.laudo = laudo;
    this.estaPago = estaPago;

    this.equipamento.adiconarServico(this);
    this.equipamento.iniciarManutencao();
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    for (ServicoFornecido servico : servicos) {
      valorTotal += servico.getValor();
    }

    return valorTotal;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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


  public void iniciar() {
    this.status.iniciar(this);
  }

  public void cancelar() {
    this.status.cancelar(this);
  }

  public void registrarPagamento() {
    this.estaPago = true;
  }

  public boolean estaPago() {
    return this.estaPago;
  }

  public void finalizar(String laudo) {
    this.status.finalizar(this);
    this.equipamento.iniciarColeta();
    this.laudo = laudo;
  }

  public double calcularValor() {
    return 0;
  }

  public void adicionarServicoFornecido(ServicoFornecido servicoFornecido) {
    this.servicos.add(servicoFornecido);
  }

  public void removerServicoFornecido(ServicoFornecido servicoFornecido) {
    this.servicos.remove(servicoFornecido);
  }

  @Override
  public String toString() {
    return "Servico{" +
        "nome='" + nome + '\'' +
        ", equipamento=" + equipamento.getCliente().getNome() +
        ", daVenda=" + daVenda +
        ", dataInicio=" + dataInicio +
        ", responsavel=" + responsavel +
        ", servicos=" + servicos +
        ", status=" + status +
        ", valor=" + valor +
        ", laudo='" + laudo + '\'' +
        ", estaPago=" + estaPago +
        '}';
  }
}
