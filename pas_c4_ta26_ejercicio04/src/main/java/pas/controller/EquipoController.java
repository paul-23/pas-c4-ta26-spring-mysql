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

import pas.dto.Equipo;
import pas.service.EquipoService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoService equipoService;

	@GetMapping("/equipos")
	public List<Equipo> listEquipos() {
		return equipoService.listaEquipos();
	}

	@GetMapping("/equipos/{id}")
	public Equipo equipoById(@PathVariable(name = "id") String id) {
		
		Equipo equipoXID = new Equipo();
		equipoXID = equipoService.equipoXID(id);
		return equipoXID;
	}

	@PostMapping("/equipos")
	public Equipo saveEquipo(@RequestBody Equipo equipo) {
		
		return equipoService.guardarEquipo(equipo);
	}

	@PutMapping("/equipos/{id}")
	public Equipo updateEquipo(@PathVariable(name = "id") String id, @RequestBody Equipo equipo) {
		
		Equipo selectedEquipo = new Equipo(id, equipo.getNombre(), equipo.getFacultad());
		Equipo updatedEquipo = new Equipo();
		updatedEquipo = equipoService.actualizarEquipo(selectedEquipo);
		return updatedEquipo;
	}

	@DeleteMapping("/equipos/{id}")
	public void deleteEquipo(@PathVariable(name = "id") String id) {
		
		equipoService.eliminarEquipo(id);
	}

}
