package com.fstt.dao;

import com.fstt.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<ClientEntity, Integer> {

    ClientEntity findClientEntitiesByFirstName(String firstname);
    ClientEntity findClientEntitiesById(int id);
    ClientEntity save(ClientEntity clientEntity);
}
