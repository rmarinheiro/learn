package br.com.rafael.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.learn.entities.Enrollment;
import br.com.rafael.learn.entities.pk.EnrollmentPK;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
