package com.brunomarques.contasfavoritas.repository;


import com.brunomarques.contasfavoritas.model.ContaFavorita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaFavoritaRepository extends JpaRepository<ContaFavorita, Long> {
}


