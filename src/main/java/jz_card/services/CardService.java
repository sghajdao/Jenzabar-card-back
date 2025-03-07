package jz_card.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jz_card.dto.Response;
import jz_card.entities.CandidacyCard;
import jz_card.entities.InfoCard;
import jz_card.entities.StudentCard;
import jz_card.repositories.CandidacyCardRepository;
import jz_card.repositories.InfoCardRepository;
import jz_card.repositories.StudentCardRepository;

@Service
public class CardService {
    @Autowired
    private InfoCardRepository infoCardRepository;
    @Autowired
    private CandidacyCardRepository candidacyCardRepository;
    @Autowired
    private StudentCardRepository studentCardRepository;

    public Response getById(Long id) {
        InfoCard info = infoCardRepository.findByStudetId(id).orElse(null);
        List<CandidacyCard> candiday = candidacyCardRepository.findByStudetId(id).orElse(null);
        StudentCard student = studentCardRepository.findById(id).orElse(null);
        return new Response(info, candiday, student);
    }
}
