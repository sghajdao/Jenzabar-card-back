package jz_card.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "INFO_CARD_VIEW")
public class InfoCard {
    @Id
    private Long appid;

    private Long id_num;
    private String name_format;
    private String last_name;
    private String first_name;
    private String middle_name;
    private String birth_name;
    private Long mobile_phone;
    private String email_address;
    private String stud_mstr_employ;
}
