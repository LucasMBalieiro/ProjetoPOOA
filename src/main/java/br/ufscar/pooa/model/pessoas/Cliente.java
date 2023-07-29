package br.ufscar.pooa.model.pessoas;

import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

  public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
    super(nome, cpf, telefone, email, endereco);
  }
}