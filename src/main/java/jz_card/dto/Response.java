package jz_card.dto;

import java.util.List;

import jz_card.entities.CandidacyCard;
import jz_card.entities.InfoCard;
import jz_card.entities.StudentCard;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private InfoCard info;
    private List<CandidacyCard> candiday;
    private StudentCard student;
}
