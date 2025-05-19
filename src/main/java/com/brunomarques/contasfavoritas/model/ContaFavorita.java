package com.brunomarques.contasfavoritas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class ContaFavorita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do favorecido é obrigatório")
    @Size(max = 100, message = "O nome do favorecido deve ter no máximo 100 caracteres")
    private String nomeFavorecido;

    @NotBlank(message = "A agência é obrigatória")
    @Size(max = 10, message = "A agência deve ter no máximo 10 caracteres")
    private String agencia;

    @NotBlank(message = "O número da conta é obrigatório")
    @Size(max = 20, message = "O número da conta deve ter no máximo 20 caracteres")
    private String numeroConta;

    @NotBlank(message = "O tipo de conta é obrigatório")
    private String tipoConta;

    // Construtor vazio
    public ContaFavorita() {
    }

    // Construtor completo
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



