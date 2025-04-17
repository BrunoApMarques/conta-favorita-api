package com.brunomarques.contasfavoritas.service;

import com.brunomarques.contasfavoritas.model.ContaFavorita;
import com.brunomarques.contasfavoritas.repository.ContaFavoritaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
@Service
public class ContaFavoritaService {

    @Autowired
    private ContaFavoritaRepository repository;

    public List<ContaFavorita> listarTodas() {
        return repository.findAll();
    }

    public ContaFavorita buscarPorId(Long id) {
        Optional<ContaFavorita> conta = repository.findById(id);
        return conta.orElse(null);
    }

    public ContaFavorita salvar(ContaFavorita contaFavorita) {
        return repository.save(contaFavorita);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public ContaFavorita atualizar(Long id, ContaFavorita novaConta) {
        Optional<ContaFavorita> contaExistente = repository.findById(id);
        if (contaExistente.isPresent()) {
            ContaFavorita conta = contaExistente.get();
            conta.setNomeFavorecido(novaConta.getNomeFavorecido());
            conta.setAgencia(novaConta.getAgencia());
            conta.setNumeroConta(novaConta.getNumeroConta());
            conta.setTipoConta(novaConta.getTipoConta());
            return repository.save(conta);
        }
        return null;
    }

}


