package fr.orsys.msa.gc.data;

import fr.orsys.msa.gc.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends JpaRepository<Client, Integer> {
}
