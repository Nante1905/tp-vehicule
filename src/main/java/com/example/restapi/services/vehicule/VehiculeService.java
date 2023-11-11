package com.example.restapi.services.vehicule;

import org.springframework.stereotype.Service;

import com.example.restapi.crud.service.GenericService;
import com.example.restapi.model.Vehicule;

@Service
public class VehiculeService extends GenericService<Vehicule> {
    // @Autowired
    // private VehiculeRepo vehiculeRepo;

    // public List<Vehicule> findAll() {
    // return this.vehiculeRepo.findAll();
    // }

    // public Vehicule findVehiculeById(int id) throws Exception {
    // return this.vehiculeRepo.findById(id).orElseThrow(() -> new
    // Exception("Vehicule inexistant"));
    // }

    // public void save(Vehicule vehicule) throws Exception {
    // this.vehiculeRepo.save(vehicule);
    // }

    // public void update(Vehicule vehicule, int id) throws Exception {
    // vehicule.setId(id);
    // this.vehiculeRepo.save(vehicule);
    // }
}
