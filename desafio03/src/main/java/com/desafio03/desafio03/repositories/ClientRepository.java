package com.desafio03.desafio03.repositories;

import com.desafio03.desafio03.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
