package br.ufscar.pooa;

import br.ufscar.pooa.model.armazenamento.estoque.itens.Equipamento;
import br.ufscar.pooa.model.armazenamento.estoque.itens.Peca;

import java.util.Arrays;

public class ComercioMain {

  public static void main(String[] args) {
    System.out.println("Populando o estoque...");

    Equipamento equipamento = new Equipamento(
        12223212,
        "Toyama",
        "Gerador Toyama TG2800CX",
        0,
        2000.00,
        Arrays.asList("Gerador", "Gasolina")

    );

    Peca filtroDeAr = new Peca(
        12223212,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800CXXX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        null
    );

    Peca filtroDeAr2 = new Peca(
        1222321211,
        "Toyama",
        "Filtro de ar do Gerador Toyama TG2800CX",
        10,
        30.00,

        Arrays.asList("Filtro", "Ar", "Gerador", "Toyama"),
        Arrays.asList(equipamento)
    );


  }
}
