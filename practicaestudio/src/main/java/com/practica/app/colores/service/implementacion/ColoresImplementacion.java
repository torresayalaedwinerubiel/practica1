package com.practica.app.colores.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.app.colores.entity.ColoresEntity;
import com.practica.app.colores.repository.Coloresrepository;
import com.practica.app.colores.service.ColoreService;

@Service
public class ColoresImplementacion implements ColoreService {

	@Autowired
	private Coloresrepository coloresdao;

	@Override
	public ColoresEntity insertarColor(ColoresEntity color) {
		// TODO Auto-generated method stub
		return coloresdao.save(color);
	}

	@Override
	public List<ColoresEntity> consultaColores() {
		// TODO Auto-generated method stub
		return (List<ColoresEntity>) coloresdao.findAll();
	}

	@Override
	public void atualizaColor(ColoresEntity color) {
		// TODO Auto-generated method stub
		coloresdao.save(color);
	}

	@Override
	public void borraColor(int id) {
		// TODO Auto-generated method stub
		coloresdao.deleteById(id);
	}

}
