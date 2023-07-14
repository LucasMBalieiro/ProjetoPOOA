package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String endereco;
  private List<EquipamentoCliente> equipamentos;
  private DadosPessoais dadosPessoais;

  public Cliente(String endereco, DadosPessoais dadosPessoais) {
    this.endereco = endereco;
    this.equipamentos = new ArrayList<>();
    this.dadosPessoais = dadosPessoais;
  }

  public Cliente(String endereco, List<EquipamentoCliente> equipamentos, DadosPessoais dadosPessoais) {
    this.endereco = endereco;
    this.equipamentos = equipamentos;
    this.dadosPessoais = dadosPessoais;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public List<EquipamentoCliente> getEquipamentos() {
    return equipamentos;
  }

  public void setEquipamentos(List<EquipamentoCliente> equipamentos) {
    this.equipamentos = equipamentos;
  }

  public DadosPessoais getDadosPessoais() {
    return dadosPessoais;
  }

  public void setDadosPessoais(DadosPessoais dadosPessoais) {
    this.dadosPessoais = dadosPessoais;
  }

  @Override
  public String toString() {
    return "Cliente{" +
        "endereco='" + endereco + '\'' +
        ", equipamentos=" + equipamentos +
        ", dadosPessoais=" + dadosPessoais +
        '}';
  }

  public void adicionarEquipamento(EquipamentoCliente equipamentoCliente) {
    this.equipamentos.add(equipamentoCliente);
    System.out.println("Equipamento adicionado com sucesso!" + equipamentos.toString());
  }
}