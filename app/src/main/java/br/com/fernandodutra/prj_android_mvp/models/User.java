package br.com.fernandodutra.prj_android_mvp.models;

/**
 * Created by Fernando Dutra
 * User: Fernando Dutra
 * Date: 25/06/2019
 * Time: 09:40
 * Prj_Android_MVP
 */
public class User {

    private String nome;
    private String senha;

    public User() {
        this.nome = "";
        this.senha = "";
    }

    public User(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
