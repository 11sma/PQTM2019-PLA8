package pla8.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pla8.dao.IContactoDao;
import pla8.entity.Contacto;

@Transactional
@Service
public class ContactoService implements IContactoService {

	@Autowired 
	private IContactoDao contactoDao;

	@Override
	public List<Contacto> getContactos() {
		return contactoDao.getContactos();
	}

	@Override
	public void save(Contacto contacto) {
		contactoDao.save(contacto);
	}

	@Override
	public Contacto getContacto(int idcontacto) {
		return contactoDao.getContacto(idcontacto);
	}

	@Override
	public void delete(Contacto contacto) {
		contactoDao.delete(contacto);
		
	}
	
	
}
