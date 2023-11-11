package com.example.restapi.repositories.vehicule;

import java.util.List;

import com.example.restapi.crud.repository.GenericRepository;
import com.example.restapi.model.Kilometrage;

public interface KilometrageRepo extends GenericRepository<Kilometrage> {
    public List<Kilometrage> findByVehiculeId(int id);
}
