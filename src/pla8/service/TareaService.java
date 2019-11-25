package pla8.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pla8.dao.ITareaDao;
import pla8.entity.Tarea;

@Transactional
@Service
public class TareaService implements ITareaService {

	@Autowired 
	private ITareaDao tareaDao;

	@Override
	public List<Tarea> getTareas() {
		return tareaDao.getTareas();
	}

	@Override
	public void save(Tarea tarea) {
		tareaDao.save(tarea);
	}

	@Override
	public Tarea getTarea(int idtarea) {
		return tareaDao.getTarea(idtarea);
	}

	@Override
	public void delete(Tarea tarea) {
		tareaDao.delete(tarea);
		
	}
	
	
}
