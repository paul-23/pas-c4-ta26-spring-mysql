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

import pas.dto.Cientifico;
import pas.service.CientificoServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;

	@GetMapping("/cientificos")
	public List<Cientifico> listCientificos() {
		return cientificoServiceImpl.listarCientificos();
	}

	@GetMapping("/cientificos/{DNI}")
	public Cientifico cientificoById(@PathVariable(name = "DNI") String DNI) {
		Cientifico cientificoXID = new Cientifico();

		cientificoXID = cientificoServiceImpl.cientificoXID(DNI);

		return cientificoXID;
	}

	@PostMapping("/cientificos")
	public Cientifico saveCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}

	@PutMapping("/cientificos/{DNI}")
	public Cientifico updateCientifico(@PathVariable(name = "DNI") String DNI, @RequestBody Cientifico cientifico) {
		Cientifico selectedCientifico = new Cientifico(DNI, cientifico.getNombre_apellidos());
		Cientifico updatedCientifico = new Cientifico();

		updatedCientifico = cientificoServiceImpl.actualizarCientifico(selectedCientifico);
		return updatedCientifico;
	}

	@DeleteMapping("/cientificos/{DNI}")
	public void deleteCientifico(@PathVariable(name = "DNI") String DNI) {
		cientificoServiceImpl.eliminarCientifico(DNI);
	}

}
