package jz_card.entities;

import java.util.Date;

import jakarta.persistence.Column;
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
@Table(name = "CANDIDACY_CARD_VIEW")
public class CandidacyCard {
    @Id
    @Column(name = "ID_NUM")
    private Long idNum;

    @Column(name = "YR_CDE")
    private String yearCode;

    @Column(name = "DIV_CDE")
    private String divisionCode;

    @Column(name = "STAGE")
    private String stage;

    @Column(name = "PROG_CDE")
    private String programCode;

    @Column(name = "TRM_CDE")
    private String termCode;

    @Column(name = "Bac year")
    private String bacYear;

    @Column(name = "HIGH_SCHOOL")
    private String highSchool;

    @Column(name = "High school diploma")
    private String highSchoolDiploma;

    @Column(name = "High School distinction")
    private String highSchoolDistinction;

    @Column(name = "HS_Org_Type_AD")
    private String hsOrgTypeAd;

    @Column(name = "gpa")
    private Double gpa;

    @Column(name = "total_ap_credits")
    private Integer totalApCredits;

    @Column(name = "total_inst_credits")
    private Integer totalInstCredits;

    @Column(name = "CL_Org_Type_AD")
    private String clOrgTypeAd;

    @Column(name = "CL_GPA")
    private Double clGpa;

    @Column(name = "CL_Total_AP_Credits")
    private Integer clTotalApCredits;

    @Column(name = "CL_Total_Inst_Credits")
    private Integer clTotalInstCredits;

    @Column(name = "school_type")
    private String schoolType;

    @Column(name = "udef_1a_1")
    private String udef1a1;

    @Column(name = "ACt")
    private String act;

    @Column(name = "GAT")
    private String gat;

    @Column(name = "GRE")
    private String gre;

    @Column(name = "SAT")
    private String sat;

    @Column(name = "SATRC")
    private String satRc;

    @Column(name = "SATWC")
    private String satWc;

    @Column(name = "TEF")
    private String tef;

    @Column(name = "TOEPP")
    private String toepp;

    @Column(name = "birth_dte")
    private Date birthDate;

    @Column(name = "citizen_of")
    private String citizenOf;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ADDR_LINE_1")
    private String addressLine1;

    @Column(name = "BIRTH_NAME")
    private String birthName;

    // @Column(name = "AlternateContact")
    // private String alternateContact;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "Father address")
    private String fatherAddress;

    @Column(name = "Mother address")
    private String motherAddress;

    @Column(name = "Father Phone")
    private String fatherPhone;

    @Column(name = "Mother Phone")
    private String motherPhone;

    @Column(name = "Father Occupation")
    private String fatherOccupation;

    @Column(name = "Mother Occupation")
    private String motherOccupation;

    @Column(name = "app_fee_dte")
    private Date appFeeDate;
}
