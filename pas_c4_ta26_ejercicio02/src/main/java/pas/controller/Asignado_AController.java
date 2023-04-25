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

import pas.dto.Asignado_A;
import pas.service.AsignadoAServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class Asignado_AController {

	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;

	@GetMapping("/asignado")
	public List<Asignado_A> listAsignado_As() {
		return asignadoAServiceImpl.listarAsignados();
	}

	@GetMapping("/asignado/{id}")
	public Asignado_A asignado_AById(@PathVariable(name = "id") Long id) {
		Asignado_A asignadoXID = new Asignado_A();

		asignadoXID = asignadoAServiceImpl.asignadoXID(id);

		return asignadoXID;
	}

	@PostMapping("/asignado")
	public Asignado_A saveAsignado_A(@RequestBody Asignado_A asignado_A) {
		return asignadoAServiceImpl.guardarAsignadoA(asignado_A);
	}

	@PutMapping("/asignado/{id}")
	public Asignado_A updateAsignado_A(@PathVariable(name = "id") Long id, @RequestBody Asignado_A asignado_A) {
		Asignado_A selectedAsignado = new Asignado_A(id, asignado_A.getCientifico(), asignado_A.getProyecto());
		Asignado_A updatedAsignado = new Asignado_A();

		updatedAsignado = asignadoAServiceImpl.actualizarAsignado(selectedAsignado);
		return updatedAsignado;
	}

	@DeleteMapping("/asignado/{id}")
	public void deleteAsignado_A(@PathVariable(name = "id") Long id) {
		asignadoAServiceImpl.eliminarAsignado(id);
	}
	
}
