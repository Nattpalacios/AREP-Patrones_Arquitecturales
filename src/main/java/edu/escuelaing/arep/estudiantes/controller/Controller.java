package edu.escuelaing.arep.estudiantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.estudiantes.repositorios.Repositorio;

@RestController
@RequestMapping(value = "/estudiantes")
public class Controller {

	@Autowired
	Repositorio repositorio;
	
	@GetMapping()
	public ResponseEntity<?> todosLosEstudiantes(){
	    try {
	        return new ResponseEntity<>(repositorio.encontrarTodos(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Hubo un fallo",HttpStatus.NOT_FOUND);
	    }
    }
}