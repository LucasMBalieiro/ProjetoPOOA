package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.pessoas.Cliente;

import java.util.List;

public class Venda {
    private List<Item> itens;
    private Cliente cliente;

    // Constructor
    public Venda(List<Item> itens, Cliente cliente) {
        this.itens = itens;
        this.cliente = cliente;
    }

    // Setter and Getter methods
    public List<Item> getItens() { return itens; }

    public void setItens(List<Item> itens) { this.itens = itens; }

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

}