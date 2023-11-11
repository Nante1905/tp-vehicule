package com.example.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.crud.controller.GenericController;
import com.example.restapi.model.Vehicule;
import com.example.restapi.services.vehicule.KilometrageService;
import com.example.restapi.types.response.Response;

@RestController
@RequestMapping("vehicules")
public class VechiculeController extends GenericController<Vehicule> {

    @Autowired
    KilometrageService kilometrageService;

    @RequestMapping("/{id}/kilometrages")
    public ResponseEntity<?> findByIdVehicule(@PathVariable int id) {
        try {
            return ResponseEntity.ok(new Response(this.kilometrageService.findByVehiculeId(id), ""));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new Response(e.getMessage()));
        }
    }
    // @Autowired
    // private VehiculeService vehiculeService;

    // @GetMapping("/{id}")
    // public ResponseEntity<?> findById(@PathVariable(name = "id") int id) {
    // try {
    // return ResponseEntity.ok().body(this.vehiculeService.findVehiculeById(id));
    // } catch (Exception e) {
    // return ResponseEntity.status(404).body(e.getMessage());
    // }
    // }

    // @PostMapping("")
    // public ResponseEntity<?> insert(@RequestBody Vehicule vehicule) {

    // HashMap<String, Object> response = new HashMap<>();
    // try {
    // this.vehiculeService.save(vehicule);
    // response.put("OK", true);
    // response.put("message", "Vehicule inseré");
    // return ResponseEntity.ok().body(response);
    // } catch (Exception e) {
    // response.put("OK", false);
    // response.put("err", e.getMessage());
    // return ResponseEntity.internalServerError().body(response);
    // }
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<?> update(@PathVariable(name = "id") int id,
    // @RequestBody Vehicule vehicule) {

    // HashMap<String, Object> response = new HashMap<>();
    // try {
    // this.vehiculeService.update(vehicule, id);
    // response.put("OK", true);
    // response.put("message", "Vehicule mis à jour");
    // return ResponseEntity.ok().body(response);
    // } catch (Exception e) {
    // response.put("OK", false);
    // response.put("err", e.getMessage());
    // return ResponseEntity.internalServerError().body(response);
    // }
    // }
}
