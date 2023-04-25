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

import pas.dto.Maquina;
import pas.service.MaquinaService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class MaquinaController {

	@Autowired
	MaquinaService maquinaService;

	@GetMapping("/maquinas_registradoras")
	public List<Maquina> listMaquinas() {
		
		return maquinaService.listaMaquinas();
	}

	@GetMapping("/maquinas_registradoras/{id}")
	public Maquina maquinaXID(@PathVariable(name = "id") Long id) {
		
		Maquina maquinaXID = new Maquina();
		maquinaXID = maquinaService.maquinaXID(id);
		return maquinaXID;
	}

	@PostMapping("/maquinas_registradoras")
	public Maquina saveMaquina(@RequestBody Maquina maquina) {
		
		return maquinaService.guardarMaquina(maquina);
	}

	@PutMapping("/maquinas_registradoras/{id}")
	public Maquina updateMaquina(@PathVariable(name = "id") Long id, @RequestBody Maquina maquina) {
		
		Maquina selectedMaquina = new Maquina(id, maquina.getPiso());
		Maquina updatedMaquina = new Maquina();
		updatedMaquina = maquinaService.actualizarMaquina(selectedMaquina);
		return updatedMaquina;
	}

	@DeleteMapping("/maquinas_registradoras/{id}")
	public void deleteMaquina(@PathVariable(name = "id") Long id) {
		
		maquinaService.eliminarMaquina(id);
	}

}
