package edu.escuelaing.arep.estudiantes.repositorios.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import edu.escuelaing.arep.estudiantes.entidades.Estudiante;
import edu.escuelaing.arep.estudiantes.repositorios.Repositorio;


@Component
public class RepositorioEstudiantes implements Repositorio {


	@Autowired
	private DataSource dataSource;

    public List<Estudiante> encontrarTodos() throws SQLException {
       String query = "SELECT * FROM estudiantes;";
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
                int codigo = Integer.parseInt(rs.getString("codigo"));
                String carrera = rs.getString("carrera");
				Estudiante estudiante = new Estudiante(nombre,codigo,carrera);									
				estudiantes.add(estudiante);
			}
			connection.close();
			return estudiantes;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }
}