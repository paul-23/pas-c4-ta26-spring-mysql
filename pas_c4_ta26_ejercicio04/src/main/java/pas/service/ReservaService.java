/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IReservaDAO;
import pas.dto.Reserva;

/**
 * @author paul_
 *
 */

@Service
public class ReservaService {

	@Autowired
	IReservaDAO reservaDAO;

	public List<Reserva> listaReservas() {
		return reservaDAO.findAll();
	}

	public Reserva guardarReserva(Reserva reserva) {
		return reservaDAO.save(reserva);
	}

	public Reserva reservaXID(Long id) {
		return reservaDAO.findById(id).get();
	}

	public Reserva actualizarReserva(Reserva reserva) {
		return reservaDAO.save(reserva);
	}

	public void eliminarReserva(Long id) {
		reservaDAO.deleteById(id);
	}
	
}
