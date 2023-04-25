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

import pas.dto.Reserva;
import pas.service.ReservaService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaService reservaService;

	@GetMapping("/reservas")
	public List<Reserva> listReservas() {

		return reservaService.listaReservas();
	}

	@GetMapping("/reservas/{id}")
	public Reserva reservaById(@PathVariable(name = "id") Long id) {

		Reserva reservaXID = new Reserva();
		reservaXID = reservaService.reservaXID(id);
		return reservaXID;
	}

	@PostMapping("/reservas")
	public Reserva saveReserva(@RequestBody Reserva reserva) {

		return reservaService.guardarReserva(reserva);
	}

	@PutMapping("/reservas/{id}")
	public Reserva updateReserva(@PathVariable(name = "id") Long id, @RequestBody Reserva reserva) {

		Reserva selectedReserva = new Reserva(id, reserva.getEquipo(), reserva.getInvestigador(), reserva.getComienzo(),
				reserva.getFin());
		Reserva updatedReserva = new Reserva();
		updatedReserva = reservaService.actualizarReserva(selectedReserva);
		return updatedReserva;
	}

	@DeleteMapping("/reservas/{id}")
	public void deleteReserva(@PathVariable(name = "id") Long id) {
		
		reservaService.eliminarReserva(id);
	}

}
