package org.europol.eu.emas.emasbackend.controller;

import org.europol.eu.emas.emasbackend.model.Submission;
import org.europol.eu.emas.emasbackend.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/submission")
public class SubmissionController {

    @Autowired
    private SubmissionService submissionService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Submission submission) {
        return new ResponseEntity<>(submissionService.saveSubmission(submission), HttpStatus.CREATED);
    }


    @DeleteMapping("{submissionId}")
    public ResponseEntity<?> delete(@PathVariable Long submissionId) {
        submissionService.deleteSubmission(submissionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(submissionService.findAllSubmissions(), HttpStatus.OK);
    }

}
