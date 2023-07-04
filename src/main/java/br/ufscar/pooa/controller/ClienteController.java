package br.ufscar.pooa.controller;

import br.ufscar.pooa.model.pessoas.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    private List<Cliente> clientes;

    public ClienteController() {
        clientes = new ArrayList<>();
    }

    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void remover(String CPF) {
        Cliente clientRemove = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(CPF)) {
                clientRemove = cliente;
                break;
            }
        }
        if (clientRemove != null) {
            clientes.remove(clientRemove);
        }
    }

    public void atualizar(Cliente clienteAtualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getCPF().equals(clienteAtualizado.getCPF())) {
                clientes.set(i, clienteAtualizado);
                break;
            }
        }
    }

    public Cliente obterPorCPF(String CPF) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(CPF)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente obterPorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> obterTodosOsClientes() {
        return clientes;
    }
}
