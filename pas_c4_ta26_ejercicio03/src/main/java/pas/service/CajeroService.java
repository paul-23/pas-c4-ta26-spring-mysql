/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.ICajeroDAO;
import pas.dto.Cajero;

/**
 * @author paul_
 *
 */

@Service
public class CajeroService {

	@Autowired
	ICajeroDAO cajeroDAO;

	public List<Cajero> listaCajeros() {
		return cajeroDAO.findAll();
	}

	public Cajero guardarCajero(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}

	public Cajero cajeroXID(Long id) {
		return cajeroDAO.findById(id).get();
	}

	public Cajero actualizarCajero(Cajero cajero) {
		return cajeroDAO.save(cajero);
	}

	public void eliminarCajero(Long id) {
		cajeroDAO.deleteById(id);
	}
	
}
