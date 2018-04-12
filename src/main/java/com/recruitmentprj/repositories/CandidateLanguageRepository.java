package com.recruitmentprj.repositories;

import com.recruitmentprj.entities.Candidate;
import com.recruitmentprj.entities.CandidateLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidateLanguageRepository extends JpaRepository<CandidateLanguage, Long> {
    List<CandidateLanguage> findAllByCandidate(Candidate candidate);
}
