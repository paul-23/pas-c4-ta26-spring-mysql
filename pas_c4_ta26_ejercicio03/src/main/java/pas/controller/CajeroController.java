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

import pas.dto.Cajero;
import pas.service.CajeroService;

/**
 * @author paul_
 *
 */

@RestController // Rest controller
@RequestMapping("/api")
public class CajeroController {

	// Implement service
	@Autowired
	CajeroService cajeroService;

	@GetMapping("/cajeros")
	public List<Cajero> listCajeros() {
		
		return cajeroService.listaCajeros();
	}

	@GetMapping("/cajeros/{id}")
	public Cajero cajeroById(@PathVariable(name = "id") Long id) {
		
		Cajero cajeroXID = new Cajero();
		cajeroXID = cajeroService.cajeroXID(id);
		return cajeroXID;
	}

	@PostMapping("/cajeros")
	public Cajero saveCajero(@RequestBody Cajero cajero) {
		
		return cajeroService.guardarCajero(cajero);
	}

	@PutMapping("/cajeros/{id}")
	public Cajero updateCajero(@PathVariable(name = "id") Long id, @RequestBody Cajero cajero) {
		
		Cajero selectedCajero = new Cajero(id, cajero.getNombre_apellidos());
		Cajero updatedCajero = new Cajero();
		updatedCajero = cajeroService.actualizarCajero(selectedCajero);
		return updatedCajero;
	}

	@DeleteMapping("/cajeros/{id}")
	public void deleteCajero(@PathVariable(name = "id") Long id) {
		
		cajeroService.eliminarCajero(id);
	}

}
