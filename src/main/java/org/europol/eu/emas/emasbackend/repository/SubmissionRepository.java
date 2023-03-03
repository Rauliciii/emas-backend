package org.europol.eu.emas.emasbackend.repository;


import org.europol.eu.emas.emasbackend.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
