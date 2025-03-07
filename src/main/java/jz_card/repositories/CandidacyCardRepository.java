package jz_card.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jz_card.entities.CandidacyCard;

@Repository
public interface CandidacyCardRepository extends JpaRepository<CandidacyCard, Long> {
    @Query(value = "SELECT * FROM candidacy_card_view WHERE id_num = :id", nativeQuery = true)
    Optional<List<CandidacyCard>> findByStudetId(@Param("id") Long id);
}
