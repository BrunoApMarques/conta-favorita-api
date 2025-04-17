package com.brunomarques.contasfavoritas.service;

import com.brunomarques.contasfavoritas.model.ContaFavorita;
import com.brunomarques.contasfavoritas.repository.ContaFavoritaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ContaFavoritaRepository contaFavoritaRepository;

    public DataLoader(ContaFavoritaRepository contaFavoritaRepository) {
        this.contaFavoritaRepository = contaFavoritaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        ContaFavorita conta = new ContaFavorita();
        conta.setNomeFavorecido("João da Silva");
        conta.setAgencia("1234");
        conta.setNumeroConta("56789-0");
        conta.setTipoConta("Corrente");

        contaFavoritaRepository.save(conta);

        System.out.println("✅ Conta favorita salva com sucesso após o startup!");
    }
}

