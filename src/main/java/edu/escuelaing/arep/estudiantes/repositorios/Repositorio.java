package edu.escuelaing.arep.estudiantes.repositorios;

import java.sql.SQLException;
import java.util.*;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.estudiantes.entidades.Estudiante;

@Service
public interface Repositorio{
    public List<Estudiante> encontrarTodos() throws SQLException ;  
}