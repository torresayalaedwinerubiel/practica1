package com.practica.app.colores.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practica.app.colores.entity.ColoresEntity;
import com.practica.app.colores.service.ColoreService;

@RestController
public class ColoresControlador {
	@Autowired
	private ColoreService coloreService;

	@PostMapping(value = "/insertacolor")
	public ColoresEntity insertarColor( @RequestBody ColoresEntity color) {
		return coloreService.insertarColor(color);
	}

	@GetMapping(value = "/consultacolor")
	public List<ColoresEntity> consultaColores() {
		return coloreService.consultaColores();
	}

	@PutMapping(value = "/atulizacolor")
	public String atualizaColor( @RequestBody ColoresEntity color) {
		coloreService.atualizaColor(color);
		return "exito";
	}

	@DeleteMapping(value = "/borracolor/{id}")
	public String borraColor(@PathVariable(value = "id")  int id) {
		coloreService.borraColor(id);
		return "exito";
	}

}
