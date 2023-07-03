package br.ufscar.pooa.model.pessoas;

public class Pessoa {
    private String CPF;
    private String nome;
    private String login;
    private String senha;
    private String telefone;
    private String email;
    public String getCPF() {
        return CPF;
    }

    public Pessoa(String CPF, String nome, String login, String senha, String telefone, String email) {
        this.CPF = CPF;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
