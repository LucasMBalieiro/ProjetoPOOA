//package br.ufscar.pooa.controller;
//import br.ufscar.pooa.model.armazenamento.estoque.itens.Equipamento;
//import br.ufscar.pooa.model.armazenamento.estoque.itens.Peca;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class EquipamentoController {
//    private List<Equipamento> equipamentos;
//
//    public EquipamentoController() {
//        equipamentos = new ArrayList<>();
//    }
//
//    public void adicionar(Equipamento equipamento) {
//        equipamentos.add(equipamento);
//    }
//
//    public void remover(Equipamento equipamento) {
//        equipamentos.remove(equipamento);
//    }
//
//    public void atualizar(Equipamento equipAtualizado) {
//        for (Equipamento equipamento : equipamentos) {
//            if (equipamento.equals(equipAtualizado)) {
//                equipamento.setMarca(equipAtualizado.getMarca());
//                equipamento.setQuantidadeDeEstoque(equipAtualizado.getQuantidadeDeEstoque());
//                equipamento.setValor(equipAtualizado.getValor());
//                equipamento.setTipo(equipAtualizado.getTipo());
//                equipamento.setValorMaoDeObra(equipAtualizado.getValorMaoDeObra());
//                equipamento.setValorEntregaTecnica(equipAtualizado.getValorEntregaTecnica());
//                equipamento.setPecas(equipAtualizado.getPecas());
//                break;
//            }
//        }
//    }
//
//    public List<Equipamento> obterPorModelo(String modelo) {
//        List<Equipamento> equipamentosEncontrados = new ArrayList<>();
//        for (Equipamento equipamento : equipamentos) {
//            if (equipamento.getModelo().equals(modelo)) {
//                equipamentosEncontrados.add(equipamento);
//            }
//        }
//        return equipamentosEncontrados;
//    }
//
//    public List<Equipamento> obterPorMarca(String marca) {
//        List<Equipamento> equipamentosEncontrados = new ArrayList<>();
//        for (Equipamento equipamento : equipamentos) {
//            if (equipamento.getMarca().equals(marca)) {
//                equipamentosEncontrados.add(equipamento);
//            }
//        }
//        return equipamentosEncontrados;
//    }
//
//    public List<Peca> obterPecas(Equipamento equipamento) {
//        return equipamento.getPecas();
//    }
//
//    public List<Equipamento> obterTodosEquip() {
//        return equipamentos;
//    }
//}
