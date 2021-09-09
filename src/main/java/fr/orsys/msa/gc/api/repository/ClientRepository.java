package fr.orsys.msa.gc.api.repository;

import fr.orsys.msa.gc.api.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {


    Optional<Client> findOneByLastname(String lastname);
}
