/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IEquipoDAO;
import pas.dto.Equipo;

/**
 * @author paul_
 *
 */

@Service
public class EquipoService {

	@Autowired
	IEquipoDAO equipoDAO;

	public List<Equipo> listaEquipos() {
		return equipoDAO.findAll();
	}

	public Equipo guardarEquipo(Equipo equipo) {
		return equipoDAO.save(equipo);
	}

	public Equipo equipoXID(String id) {
		return equipoDAO.findById(id).get();
	}

	public Equipo actualizarEquipo(Equipo equipo) {
		return equipoDAO.save(equipo);
	}

	public void eliminarEquipo(String id) {
		equipoDAO.deleteById(id);
	}
	
}
