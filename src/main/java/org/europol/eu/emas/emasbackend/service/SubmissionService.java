package org.europol.eu.emas.emasbackend.service;


import org.europol.eu.emas.emasbackend.model.Submission;

import java.util.List;

public interface SubmissionService {


    Submission saveSubmission(Submission submission);

    void deleteSubmission(Long id);

    List<Submission> findAllSubmissions();
}
