package com.recruitmentprj.services;

import com.recruitmentprj.entities.Candidate;

public interface CandidateService {
    void saveCandidate(Candidate candidate);

    long candidateCount();
}
