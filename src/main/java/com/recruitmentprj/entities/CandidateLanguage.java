package com.recruitmentprj.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CANDIDATE_LANGUAGES")
@Data
public class CandidateLanguage {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "LANGUAGE_LEVEL")
    private LanguageLevel languageLevel;

    @ManyToOne
    @JoinColumn(name = "LANGUAGE_ID")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "CANDIDATE_ID")
    private Candidate candidate;
}
