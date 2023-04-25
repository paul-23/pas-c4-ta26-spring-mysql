/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IInvestigadorDAO;
import pas.dto.Investigador;


/**
 * @author paul_
 *
 */

@Service
public class InvestigadorService {

	@Autowired
	IInvestigadorDAO InvestigadorDAO;

	public List<Investigador> listaInvestigadores() {
		return InvestigadorDAO.findAll();
	}

	public Investigador guardarInvestigador(Investigador Investigador) {
		return InvestigadorDAO.save(Investigador);
	}

	public Investigador InvestigadorXID(String dni) {
		return InvestigadorDAO.findById(dni).get();
	}

	public Investigador actualizarInvestigador(Investigador Investigador) {
		return InvestigadorDAO.save(Investigador);
	}

	public void eliminarInvestigador(String dni) {
		InvestigadorDAO.deleteById(dni);
	}
	
}
