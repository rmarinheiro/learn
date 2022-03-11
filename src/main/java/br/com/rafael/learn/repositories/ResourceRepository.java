package br.com.rafael.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafael.learn.entities.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
