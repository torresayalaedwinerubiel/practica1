package com.practica.app.colores.repository;

import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

import com.practica.app.colores.entity.ColoresEntity;

public interface Coloresrepository  extends  CrudRepository<ColoresEntity, Integer>{

}
