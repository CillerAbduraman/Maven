package com.recruitmentprj.views;

import com.recruitmentprj.entities.Candidate;
import com.recruitmentprj.services.CandidateService;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "candidateView")
@ViewScoped //cat un user este pe un anumit view; alta varianta SessionScoped
@Data //lombok - plugin care se ocupa de getteri si setteri
public class CandidateView {

    @ManagedProperty("#{candidateService}") //Spring bean - accesul la baze de date in sb
    private CandidateService candidateService;

    private Candidate selectedCandidate = new Candidate();

    private List<Candidate> candidates = new ArrayList<>(); // candidatii din bd

    private long noOfCandidates = 0;

    @PostConstruct
    public void init() {
        noOfCandidates = candidateService.candidateCount();
        candidates = candidateService.findAllCandidates();
    }

    public void saveCandidate() {
        boolean isNew = selectedCandidate.getId() == null;
        selectedCandidate = candidateService.saveCandidate(selectedCandidate);
        noOfCandidates = candidateService.candidateCount();
        FacesContext.getCurrentInstance().addMessage(null, new
                FacesMessage(FacesMessage.SEVERITY_INFO, isNew ? "Candidate Added" : "Candidate Updated", null));
        if(isNew) {
            candidates.add(selectedCandidate);
        }
    }

    public void deleteCandidate() {
        if (selectedCandidate == null || selectedCandidate.getId() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new
                    FacesMessage(FacesMessage.SEVERITY_ERROR, "No Candidate Selected", null));
        }

        candidates.removeIf(candidate -> candidate.equals(selectedCandidate));
        FacesContext.getCurrentInstance().addMessage(null, new
                FacesMessage(FacesMessage.SEVERITY_INFO, "Candidate Deleted", null));
    }

    public void newCandidate() {
        selectedCandidate = new Candidate();
    }
}
