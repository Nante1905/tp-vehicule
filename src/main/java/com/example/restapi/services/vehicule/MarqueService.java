package com.example.restapi.services.vehicule;

import org.springframework.stereotype.Service;

import com.example.restapi.crud.service.GenericService;
import com.example.restapi.model.Marque;

@Service
public class MarqueService extends GenericService<Marque> {
    // @Autowired
    // private MarqueRepo marqueRepo;

    // public List<Marque> findAll() {
    // return this.marqueRepo.findAll();
    // }

    // public Marque findById(int id) throws Exception {
    // return this.marqueRepo.findById(id).orElseThrow(() -> new Exception("Marque
    // inexistant"));
    // }

    // public boolean save(Marque marque) throws Exception {
    // this.marqueRepo.save(marque);
    // return true;
    // }

    // public boolean update(Marque marque, int id) throws Exception {
    // marque.setId(id);
    // this.marqueRepo.save(marque);
    // return true;
    // }
}
