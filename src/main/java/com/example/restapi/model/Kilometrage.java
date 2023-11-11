package com.example.restapi.model;

import java.time.LocalDate;

import com.example.restapi.crud.model.GenericModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Kilometrage extends GenericModel {
    @Id
    int id;

    @ManyToOne
    @JoinColumn(name = "id_vehicule")
    Vehicule vehicule;

    LocalDate dateCreation;
    double debutKm;
    double finKm;

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getDebutKm() {
        return debutKm;
    }

    public void setDebutKm(double debutKm) {
        this.debutKm = debutKm;
    }

    public double getFinKm() {
        return finKm;
    }

    public void setFinKm(double finKm) {
        this.finKm = finKm;
    }

}
