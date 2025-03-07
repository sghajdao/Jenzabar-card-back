package jz_card.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jz_card.entities.StudentCard;

@Repository
public interface StudentCardRepository extends JpaRepository<StudentCard, Long> {
    @Query(value = "SELECT * FROM student_card_view WHERE id_num = :id", nativeQuery = true)
    Optional<StudentCard> findByStudetId(@Param("id") Long id);
}
