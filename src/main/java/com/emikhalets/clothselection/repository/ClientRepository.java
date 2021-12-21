package com.emikhalets.clothselection.repository;

import com.emikhalets.clothselection.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
