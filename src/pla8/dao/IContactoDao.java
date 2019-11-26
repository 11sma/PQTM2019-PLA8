package pla8.dao;

import java.util.List;

import pla8.entity.Contacto;

public interface IContactoDao {

	List<Contacto> getContactos();

	void save(Contacto contacto);

	Contacto getContacto(int idcontacto);

	void delete(Contacto contacto);
}