package com.recruitmentprj.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CANDIDATES")
@Access(AccessType.FIELD)
@Data
@EqualsAndHashCode(of = "id")
@ToString(exclude = "candidateLanguages")
public class Candidate {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Embedded
    private Contact contact = new Contact();

    @OneToMany(mappedBy = "candidate")
    private List<CandidateLanguage> candidateLanguages;
}
