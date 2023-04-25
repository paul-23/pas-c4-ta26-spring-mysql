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

import pas.dto.Suministra;
import pas.service.SuministraServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraService;

	@GetMapping("/suministra")
	public List<Suministra> listSuministros() {
		return suministraService.listarSuministros();
	}

	@GetMapping("/suministra/{id}")
	public Suministra suministroById(@PathVariable(name = "id") Long id) {
		Suministra suministroxID = new Suministra();

		suministroxID = suministraService.suministraXID(id);

		return suministroxID;
	}

	@PostMapping("/suministra")
	public Suministra saveSuministro(@RequestBody Suministra suministro) {
		return suministraService.guardarSuministra(suministro);
	}

	@PutMapping("/suministra/{id}")
	public Suministra updateSuministro(@PathVariable(name = "id") Long id, @RequestBody Suministra suministro) {
		Suministra selectedSuministro = new Suministra(id, suministro.getPieza(), suministro.getProveedor(),
				suministro.getPrecio());
		Suministra updatedSuministro = new Suministra();

		updatedSuministro = suministraService.actualizarSuministra(selectedSuministro);
		return updatedSuministro;
	}

	@DeleteMapping("/suministra/{id}")
	public void deleteSuministro(@PathVariable(name = "id") Long id) {
		suministraService.eliminarSuministro(id);
	}
	
}
