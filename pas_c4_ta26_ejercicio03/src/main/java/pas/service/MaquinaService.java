/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IMaquinaDAO;
import pas.dto.Maquina;

/**
 * @author paul_
 *
 */

@Service
public class MaquinaService {

	@Autowired
	IMaquinaDAO maquina_registradoraDAO;

	public List<Maquina> listaMaquinas() {
		return maquina_registradoraDAO.findAll();
	}

	public Maquina guardarMaquina(Maquina maquina) {
		return maquina_registradoraDAO.save(maquina);
	}

	public Maquina maquinaXID(Long id) {
		return maquina_registradoraDAO.findById(id).get();
	}

	public Maquina actualizarMaquina(Maquina maquina) {
		return maquina_registradoraDAO.save(maquina);
	}

	public void eliminarMaquina(Long id) {
		maquina_registradoraDAO.deleteById(id);
	}
	
}
