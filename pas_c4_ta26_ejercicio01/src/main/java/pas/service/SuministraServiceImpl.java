/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.ISuministraDAO;
import pas.dto.Suministra;

/**
 * @author paul_
 *
 */

@Service
public class SuministraServiceImpl implements ISuministraServiceInterface {

	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministros() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministro) {
		return iSuministraDAO.save(suministro);
	}

	@Override
	public Suministra suministraXID(Long id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministro) {
		return iSuministraDAO.save(suministro);
	}

	@Override
	public void eliminarSuministro(Long id) {
		iSuministraDAO.deleteById(id);
	}
	
}
