//package br.ufscar.pooa.controller;
//
//import br.ufscar.pooa.model.servicos.servico.status.Aprovado;
//import br.ufscar.pooa.model.servicos.servico.Servico;
//import br.ufscar.pooa.model.servicos.equipamentocliente.EquipamentoCliente;
//import br.ufscar.pooa.model.servicos.fornecidos.ServicoFornecido;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ServicoController {
//    private List<Servico> servicos;
//
//    public ServicoController() {
//        this.servicos = new ArrayList<>();
//    }
//
//    public void adicionar(Servico servico) {
//        servicos.add(servico);
//        System.out.println("Serviço adicionado com sucesso!");
//    }
//
//    public void remover(Servico servico) {
//        servicos.remove(servico);
//        System.out.println("Serviço removido com sucesso!");
//    }
//
//    public void atualizar(Servico servicoAtt) {
//
//        for(Servico servico : servicos){
//            if(servico.equals(servicoAtt)){
//                servico.setNome(servicoAtt.getNome());
//                servico.setCliente(servicoAtt.getCliente());
//                servico.setEquipamento(servicoAtt.getEquipamento());
//                servico.setDaVenda(servicoAtt.getDaVenda());
//                servico.setDataInicio(servicoAtt.getDataInicio());
//                servico.setResponsavel(servicoAtt.getResponsavel());
//                servico.setServicos(servicoAtt.getServicos());
//                servico.setStatus(servicoAtt.getStatus());
//                servico.setValor(servicoAtt.getValor());
//                servico.setLaudo(servicoAtt.getLaudo());
//            }
//        }
//    }
//
//    public List<Servico> obterPorEquipamento(EquipamentoCliente equipamento) {
//        List<Servico> servicosDoEquipamento = new ArrayList<>();
//        for (Servico servico : servicos) {
//            if (servico.getEquipamento().equals(equipamento)) {
//                servicosDoEquipamento.add(servico);
//            }
//        }
//        return servicosDoEquipamento;
//    }
//
//    public void iniciar(Servico servico) {
//        servico.iniciar();
//    }
//
//    public void cancelar(Servico servico) {
//        servico.cancelar();
//    }
//
//    public void aprovar(Servico servico) {
//        servico.setStatus(new Aprovado());
//    }
//
//    public void finalizar(Servico servico) {
//        servico.finalizar();
//    }
//
//    public void adicionarServicoFornecido(Servico servico, ServicoFornecido servicoFornecido) {
//        servico.adicionarServicoFornecido(servicoFornecido);
//    }
//
//}
