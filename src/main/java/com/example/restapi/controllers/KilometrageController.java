package com.example.restapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.restapi.crud.controller.GenericController;
import com.example.restapi.model.Kilometrage;

@RequestMapping("/kilometrages")
public class KilometrageController extends GenericController<Kilometrage> {

}
