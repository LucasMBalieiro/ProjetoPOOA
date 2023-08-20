package br.ufscar.pooa.model.comercio;

import br.ufscar.pooa.model.comercio.descontos.CalculadoraDeDescontos;
import br.ufscar.pooa.model.comercio.descontos.DescontoDePagamento;
import br.ufscar.pooa.model.comercio.descontos.DescontoHandler;

import java.util.List;
import java.util.Optional;

public class GeradorDePagamento {
  private CalculadoraDeDescontos calculadoraDeDescontos;

  public GeradorDePagamento(List<DescontoHandler> descontoHandlerList) {
    this.calculadoraDeDescontos = new CalculadoraDeDescontos(descontoHandlerList);
  }

  // Metodo tradicional (com banco de dados)
//  public Pagamento gerarPagamento(Venda venda, String metodo) {
//    double subtotal = this.calcularSubtotal(venda);
//    List<DescontoDePagamento> descontos = calculadoraDeDescontos.aplicarDesconto(venda);
//    double desconto = this.descontoTotal(descontos);
//    double total = subtotal - desconto;
//
//    return new Pagamento(subtotal, total, descontos, metodo, venda);
//  }

  public Pagamento gerarPagamento(Venda venda, String metodo) {
    Pagamento pagamento = new Pagamento(metodo, venda);
    venda.setPagamento(pagamento);

    double subtotal = this.calcularSubtotal(venda);
    List<DescontoDePagamento> descontos = calculadoraDeDescontos.aplicarDesconto(venda);
    double desconto = this.descontoTotal(descontos);
    double total = subtotal - desconto;

    pagamento.setSubtotal(subtotal);
    pagamento.setTotal(total);
    pagamento.setDescontos(descontos);

    return pagamento;
  }

  public double calcularSubtotal(Venda venda) {
    return venda.getValorItens();
  }

  public double descontoTotal(List<DescontoDePagamento> descontos) {
    return descontos.stream().map(DescontoDePagamento::getValorDesconto).reduce(0.0, Double::sum);
  }
}
