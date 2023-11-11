package com.example.restapi.repositories.utilisateur;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.example.restapi.crud.repository.GenericRepository;
import com.example.restapi.model.Utilisateur;

public interface UtilisateurRepo extends GenericRepository<Utilisateur> {
    public Optional<Utilisateur> findByEmail(String email);

    @Query(value = "select * from utilisateur where email = ?1 and password = ?2", nativeQuery = true)
    public Optional<Utilisateur> findByEmailAndPassword(String email, String password);
}
