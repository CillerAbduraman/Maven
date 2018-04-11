package com.recruitmentprj.services.impl;

import com.recruitmentprj.entities.Candidate;
import com.recruitmentprj.repositories.CandidateRepository;
import com.recruitmentprj.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("candidateService")
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public void saveCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    @Override
    public long candidateCount() {
        return candidateRepository.count();
    }
}
