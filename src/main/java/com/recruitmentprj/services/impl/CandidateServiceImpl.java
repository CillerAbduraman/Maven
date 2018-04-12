package com.recruitmentprj.services.impl;

import com.recruitmentprj.entities.Candidate;
import com.recruitmentprj.repositories.CandidateRepository;
import com.recruitmentprj.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("candidateService")
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> findAllCandidates() {
        return candidateRepository.findAllByOrderByLastNameAscFirstNameAsc();
    }

    @Override
    public void deleteCandidate(Long candidateId) {
        candidateRepository.delete(candidateId);
    }

    @Override
    public long candidateCount() {
        return candidateRepository.count();
    }
}
