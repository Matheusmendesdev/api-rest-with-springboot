package br.com.matheus.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.matheus.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{}
