package com.example.apprecyclerview.activity.model;

public class Filme {

    public Filme(String filme, String categoria, String ano) {
        this.filme = filme;
        this.categoria = categoria;
        this.ano = ano;
    }

    private String filme;
    private String categoria;
    private String ano;

    public Filme(){

    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
