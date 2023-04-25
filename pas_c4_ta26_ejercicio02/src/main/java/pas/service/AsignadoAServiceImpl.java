/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IAsignado_ADAO;
import pas.dto.Asignado_A;

/**
 * @author paul_
 *
 */

@Service
public class AsignadoAServiceImpl implements IAsignadoAServiceInterface {

	@Autowired
	IAsignado_ADAO iAsignadoADAO;

	@Override
	public List<Asignado_A> listarAsignados() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public Asignado_A guardarAsignadoA(Asignado_A asignado) {
		return iAsignadoADAO.save(asignado);
	}

	@Override
	public Asignado_A asignadoXID(Long id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public Asignado_A actualizarAsignado(Asignado_A asignado) {
		return iAsignadoADAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(Long id) {
		iAsignadoADAO.deleteById(id);
	}
	
}
