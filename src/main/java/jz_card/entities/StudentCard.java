package jz_card.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT_CARD_VIEW")
public class StudentCard {
    @Id
    @Column(name = "IDNUM")
    private Long idNum;

    @Column(name = "Stud_employ_cde")
    private String studentEmployCode;

    @Column(name = "web_grp")
    private String webGroup;

    @Column(name = "tuition_cde")
    private String tuitionCode;

    @Column(name = "ENTRANCE_YR")
    private String entranceYear;

    @Column(name = "ENTRANCE_TRM")
    private String entranceTerm;

    @Column(name = "CURRENT_CLASS_CDE")
    private String currentClassCode;

    @Column(name = "HOLD_1_CDE")
    private String hold1Code;

    @Column(name = "HOLD_2_CDE")
    private String hold2Code;

    @Column(name = "HOLD_3_CDE")
    private String hold3Code;

    @Column(name = "HOLD_4_CDE")
    private String hold4Code;

    @Column(name = "HOLD_5_CDE")
    private String hold5Code;

    @Column(name = "HOLD_6_CDE")
    private String hold6Code;

    @Column(name = "NUM_OF_CRS")
    private Integer numOfCourses;

    @Column(name = "HRS_ENROLLED")
    private Integer hoursEnrolled;

    @Column(name = "TRM_HRS_EARNED")
    private Integer termHoursEarned;

    @Column(name = "CAREER_GPA")
    private Double careerGpa;

    @Column(name = "DEGR_CDE")
    private String degreeCode;

    @Column(name = "MAJOR_1")
    private String major1;

    @Column(name = "MINOR_1")
    private String minor1;

    @Column(name = "CONCENTRATION_1")
    private String concentration1;
}
