/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IFacultadDAO;
import pas.dto.Facultad;

/**
 * @author paul_
 *
 */

@Service
public class FacultadService {

	@Autowired
	IFacultadDAO facultadDAO;

	public List<Facultad> listaFacultades() {
		return facultadDAO.findAll();
	}

	public Facultad guardarFacultad(Facultad facultad) {
		return facultadDAO.save(facultad);
	}

	public Facultad facultadXID(Long id) {
		return facultadDAO.findById(id).get();
	}

	public Facultad actualizarFacultad(Facultad facultad) {
		return facultadDAO.save(facultad);
	}

	public void eliminarFacultad(Long id) {
		facultadDAO.deleteById(id);
	}
	
}
