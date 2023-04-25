/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IVentaDAO;
import pas.dto.Venta;

/**
 * @author paul_
 *
 */

@Service
public class VentaService {

	@Autowired
	IVentaDAO ventaDAO;

	public List<Venta> listaVentas() {
		return ventaDAO.findAll();
	}

	public Venta guardarVenta(Venta venta) {
		return ventaDAO.save(venta);
	}

	public Venta ventaXID(Long id) {
		return ventaDAO.findById(id).get();
	}

	public Venta actualizarVenta(Venta venta) {
		return ventaDAO.save(venta);
	}

	public void eliminarVenta(Long id) {
		ventaDAO.deleteById(id);
	}
	
}
