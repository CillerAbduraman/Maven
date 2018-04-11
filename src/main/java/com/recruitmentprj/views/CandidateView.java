package com.recruitmentprj.views;

import com.recruitmentprj.entities.Candidate;
import com.recruitmentprj.services.CandidateService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "candidateView")
@ViewScoped
public class CandidateView {

    @ManagedProperty("#{candidateService}")
    private CandidateService candidateService;

    private Candidate candidate = new Candidate();

    private long noOfCandidates = 0;

    @PostConstruct
    public void init() {
        noOfCandidates = candidateService.candidateCount();
    }

    public void saveCandidate() {
        candidateService.saveCandidate(candidate);
        noOfCandidates = candidateService.candidateCount();
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public CandidateService getCandidateService() {
        return candidateService;
    }

    public void setCandidateService(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    public long getNoOfCandidates() {
        return noOfCandidates;
    }

    public void setNoOfCandidates(long noOfCandidates) {
        this.noOfCandidates = noOfCandidates;
    }
}
