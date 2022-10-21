package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;

public interface EstudianteServicio {

	public List<Estudiante> listar();
	
	public Estudiante guardar(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante modificar(Estudiante estudiante);
	
	public void eliminar(Long id);
	
}
