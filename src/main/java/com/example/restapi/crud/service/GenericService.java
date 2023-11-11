package com.example.restapi.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.restapi.crud.model.GenericModel;
import com.example.restapi.crud.repository.GenericRepository;

public class GenericService<T extends GenericModel> {
    @Autowired
    GenericRepository<T> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public T find(int id) {
        return repository.findById(id).orElse(null);
    }

    public T save(T model) {
        return repository.save(model);
    }

    public T update(T model, int id) {
        model.setId(id);
        return repository.save(model);
    }
}
