package repository;

import com.brunomarques.contafavoritas.model.ContaFavorita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaFavoritaRepository extends JpaRepository<ContaFavorita, Long> {
}

