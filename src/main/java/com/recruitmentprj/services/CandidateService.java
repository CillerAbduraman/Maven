package com.recruitmentprj.services;

import com.recruitmentprj.entities.Candidate;

import java.util.List;

public interface CandidateService {
    Candidate saveCandidate(Candidate candidate);

    List<Candidate> findAllCandidates();

    void deleteCandidate(Long candidateId);

    long candidateCount();
}
