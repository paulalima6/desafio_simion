package br.com.pcon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pcon.api.model.Dna;

@Repository
public interface DnaRepository extends JpaRepository<Dna, Long> {
}
