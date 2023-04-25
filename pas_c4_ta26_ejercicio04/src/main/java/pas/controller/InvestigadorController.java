/**
 * 
 */
package pas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pas.dto.Investigador;
import pas.service.InvestigadorService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorService investigadorService;

	@GetMapping("/investigadores")
	public List<Investigador> listInvestigadores() {

		return investigadorService.listaInvestigadores();
	}

	@GetMapping("/investigadores/{dni}")
	public Investigador investigadorById(@PathVariable(name = "dni") String dni) {

		Investigador investigadorXID = new Investigador();
		investigadorXID = investigadorService.InvestigadorXID(dni);
		return investigadorXID;
	}

	@PostMapping("/investigadores")
	public Investigador saveInvestigador(@RequestBody Investigador investigador) {

		return investigadorService.guardarInvestigador(investigador);
	}

	@PutMapping("/investigadores/{dni}")
	public Investigador updateInvestigador(@PathVariable(name = "dni") String dni,
			@RequestBody Investigador investigador) {

		Investigador selectedInvestigador = new Investigador(dni, investigador.getNombre(), investigador.getFacultad());
		Investigador updatedInvestigador = new Investigador();
		updatedInvestigador = investigadorService.actualizarInvestigador(selectedInvestigador);
		return updatedInvestigador;
	}

	@DeleteMapping("/investigadores/{dni}")
	public void deleteInvestigador(@PathVariable(name = "dni") String dni) {

		investigadorService.eliminarInvestigador(dni);
	}

}
