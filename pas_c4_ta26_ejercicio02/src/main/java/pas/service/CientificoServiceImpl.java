/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.ICientificoDAO;
import pas.dto.Cientifico;


/**
 * @author paul_
 *
 */

@Service
public class CientificoServiceImpl implements ICientificoServiceInterface {

	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String id) {
		return iCientificoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificoDAO.deleteById(id);
	}
	
}
