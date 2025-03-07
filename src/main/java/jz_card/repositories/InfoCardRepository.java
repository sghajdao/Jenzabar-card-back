package jz_card.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jz_card.entities.InfoCard;

@Repository
public interface InfoCardRepository extends JpaRepository<InfoCard, Long> {
    @Query(value = "SELECT * FROM info_card_view WHERE id_num = :id", nativeQuery = true)
    Optional<InfoCard> findByStudetId(@Param("id") Long id);
}
