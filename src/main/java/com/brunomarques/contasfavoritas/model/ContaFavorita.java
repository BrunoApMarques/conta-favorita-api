package com.brunomarques.contasfavoritas.model;

import jakarta.persistence.Entity;

@Entity
public class ContaFavorita {

    private Long id;
    private String nomeFavorecido;
    private String agencia;
    private String numeroConta;
    private String tipoConta;

    // Construtor vazio
    public ContaFavorita() {
    }

    // Construtor com todos os atributos
    public ContaFavorita(Long id, String nomeFavorecido, String agencia, String numeroConta, String tipoConta) {
        this.id = id;
        this.nomeFavorecido = nomeFavorecido;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFavorecido() {
        return nomeFavorecido;
    }

    public void setNomeFavorecido(String nomeFavorecido) {
        this.nomeFavorecido = nomeFavorecido;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}

