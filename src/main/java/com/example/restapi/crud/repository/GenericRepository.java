package com.example.restapi.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.crud.model.GenericModel;

public interface GenericRepository<T extends GenericModel> extends JpaRepository<T, Integer> {

}
