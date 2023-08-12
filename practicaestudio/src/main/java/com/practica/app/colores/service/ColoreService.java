package com.practica.app.colores.service;

import java.util.List;

import com.practica.app.colores.entity.ColoresEntity;

public interface ColoreService {
	public ColoresEntity insertarColor(ColoresEntity color); 
	public List<ColoresEntity>consultaColores();
	public void atualizaColor(ColoresEntity color);
	public void borraColor(int id);

}
