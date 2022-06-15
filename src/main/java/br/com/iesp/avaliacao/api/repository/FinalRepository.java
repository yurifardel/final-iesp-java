package br.com.iesp.avaliacao.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.iesp.avaliacao.api.model.AlunoFinal;

@Repository
public interface FinalRepository extends JpaRepository<AlunoFinal, Integer> {
}
