package com.example.restapi.services.utilisateur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.crud.service.GenericService;
import com.example.restapi.model.Utilisateur;
import com.example.restapi.repositories.utilisateur.UtilisateurRepo;
import com.example.restapi.services.authentication.JWTManager;
import com.example.restapi.types.auth.AuthClass;

@Service
public class UtilisateurService extends GenericService<Utilisateur> {

    @Autowired
    UtilisateurRepo userRepo;

    @Autowired
    JWTManager jwt;

    public Utilisateur findByEmail(String email) throws Exception {
        return this.userRepo.findByEmail(email)
                .orElseThrow(() -> new Exception("User of email " + email + " not found"));
    }

    public String login(AuthClass user) throws Exception {
        Utilisateur utilisateur = this.userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword())
                .orElseThrow(() -> new Exception("Identifiants invalides"));

        return jwt.generateToken(utilisateur);
    }
}
