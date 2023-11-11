package com.example.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.crud.controller.GenericController;
import com.example.restapi.model.Marque;

@RestController
@RequestMapping("marques")
public class MarqueController extends GenericController<Marque> {

    // @Autowired
    // private MarqueService marqueService;

    // @GetMapping("")
    // public List<Marque> findAll() {
    // return this.marqueService.findAll();
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<?> find(@PathVariable(name = "id") int id) {
    // try {
    // return ResponseEntity.ok().body(this.marqueService.findById(id));
    // } catch (Exception e) {
    // return ResponseEntity.status(404).body(e.getMessage());
    // }
    // }

    // @PostMapping("")
    // public ResponseEntity<?> insert(@RequestBody Marque marque) {

    // HashMap<String, Object> response = new HashMap<>();
    // try {
    // this.marqueService.save(marque);
    // response.put("OK", true);
    // response.put("message", "Marque inseré");
    // return ResponseEntity.ok(response);
    // } catch (Exception e) {
    // response.put("OK", false);
    // response.put("err", e.getMessage());
    // return ResponseEntity.status(400).body(response);
    // }
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<?> update(@PathVariable(name = "id") int id,
    // @RequestBody Marque marque) {

    // HashMap<String, Object> response = new HashMap<>();
    // try {
    // this.marqueService.update(marque, id);
    // response.put("OK", true);
    // response.put("message", "Marque mis à jour");
    // return ResponseEntity.ok(response);
    // } catch (Exception e) {
    // response.put("OK", false);
    // response.put("err", e.getMessage());
    // return ResponseEntity.status(400).body(response);
    // }
    // }
}
