//package br.ufscar.pooa.controller;
//
//import br.ufscar.pooa.model.pessoas.Gerente;
//import java.util.ArrayList;
//import java.util.List;
//
//public class GerenteController {
//    private List<Gerente> gerentes;
//
//    public GerenteController() {
//        this.gerentes = new ArrayList<>();
//    }
//
//    public void adicionar(Gerente gerente) {
//        gerentes.add(gerente);
//    }
//
//    public void remover(Gerente gerente) {
//        gerentes.remove(gerente);
//    }
//
//    public void atualizar(Gerente gerenteAtualizado) {
//        for (Gerente gerente : gerentes) {
//            if (gerente.getCPF().equals(gerenteAtualizado.getCPF())) {
//                gerente.setNome(gerenteAtualizado.getNome());
//                gerente.setLogin(gerenteAtualizado.getLogin());
//                gerente.setSenha(gerenteAtualizado.getSenha());
//                gerente.setTelefone(gerenteAtualizado.getTelefone());
//                gerente.setEmail(gerenteAtualizado.getEmail());
//                break;
//            }
//        }
//    }
//
//    public Gerente obterPorCPF(String cpf) {
//        for (Gerente gerente : gerentes) {
//            if (gerente.getCPF().equals(cpf)) {
//                return gerente;
//            }
//        }
//        return null;
//    }
//
//    public List<Gerente> obterPorNome(String nome) {
//        List<Gerente> gerentesPorNome = new ArrayList<>();
//        for (Gerente gerente : gerentes) {
//            if (gerente.getNome().equals(nome)) {
//                gerentesPorNome.add(gerente);
//            }
//        }
//        return gerentesPorNome;
//    }
//
//    public Gerente obterPorEmail(String email) {
//        for (Gerente gerente : gerentes) {
//            if (gerente.getEmail().equals(email)) {
//                return gerente;
//            }
//        }
//        return null;
//    }
//
//    public List<Gerente> obterTodosGerentes() {
//        return gerentes;
//    }
//}
