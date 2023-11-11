package com.example.restapi.services.vehicule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.crud.service.GenericService;
import com.example.restapi.model.Kilometrage;
import com.example.restapi.repositories.vehicule.KilometrageRepo;

@Service
public class KilometrageService extends GenericService<Kilometrage> {

    @Autowired
    KilometrageRepo kilometrageRepo;

    public List<Kilometrage> findByVehiculeId(int id) {
        return this.kilometrageRepo.findByVehiculeId(id);
    }
}
