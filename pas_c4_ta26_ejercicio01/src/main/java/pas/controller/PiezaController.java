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

import pas.dto.Pieza;
import pas.service.PiezaServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaService;

	@GetMapping("/piezas")
	public List<Pieza> listPiezas() {
		return piezaService.listarPiezas();
	}

	@GetMapping("/piezas/{id}")
	public Pieza piezaById(@PathVariable(name = "id") Long id) {
		Pieza piezaxID = new Pieza();

		piezaxID = piezaService.piezaXID(id);

		return piezaxID;
	}

	@PostMapping("/piezas")
	public Pieza savePieza(@RequestBody Pieza pieza) {
		return piezaService.guardarPieza(pieza);
	}

	@PutMapping("/piezas/{id}")
	public Pieza updatePieza(@PathVariable(name = "id") Long id, @RequestBody Pieza pieza) {
		Pieza selectedPieza = new Pieza(id, pieza.getNombre());
		Pieza updatedPieza = new Pieza();

		updatedPieza = piezaService.actualizarPieza(selectedPieza);
		return updatedPieza;
	}

	@DeleteMapping("/piezas/{id}")
	public void deletePieza(@PathVariable(name = "id") Long id) {
		piezaService.eliminarPieza(id);
	}

}
