package pla8.service;

import java.util.List;

import pla8.entity.Tarea;


public interface ITareaService {

	List<Tarea> getTareas();

	void save(Tarea tarea);

	Tarea getTarea(int idtarea);

	void delete(Tarea tarea);

}