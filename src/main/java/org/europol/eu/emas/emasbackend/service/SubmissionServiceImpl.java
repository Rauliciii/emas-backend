package org.europol.eu.emas.emasbackend.service;


import org.europol.eu.emas.emasbackend.model.Submission;
import org.europol.eu.emas.emasbackend.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionService {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Override
    public Submission saveSubmission(Submission submission) {
        submission.setCreateTime(LocalDateTime.now());
        return submissionRepository.save(submission);
    }

    @Override
    public void deleteSubmission(Long id) {
        submissionRepository.deleteById(id);
    }

    @Override
    public List<Submission> findAllSubmissions() {
        return submissionRepository.findAll();
    }

}
