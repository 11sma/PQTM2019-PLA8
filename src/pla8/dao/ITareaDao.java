package pla8.dao;

import java.util.List;

import pla8.entity.Tarea;

public interface ITareaDao {

	List<Tarea> getTareas();

	void save(Tarea tarea);

	Tarea getTarea(int idtarea);

	void delete(Tarea tarea);
}