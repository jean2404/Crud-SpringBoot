package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImp implements EstudianteServicio {

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public List<Estudiante> listar() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardar(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudiantePorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante modificar(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminar(Long id) {

		repositorio.deleteById(id);
	}

}
