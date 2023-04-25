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

import pas.dto.Venta;
import pas.service.VentaService;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaService ventaService;

	@GetMapping("/ventas")
	public List<Venta> listVentas() {
		
		return ventaService.listaVentas();
	}

	@GetMapping("/ventas/{id}")
	public Venta ventaById(@PathVariable(name = "id") Long id) {
		
		Venta ventaXID = new Venta();
		ventaXID = ventaService.ventaXID(id);
		return ventaXID;
	}

	@PostMapping("/ventas")
	public Venta saveVenta(@RequestBody Venta venta) {
		
		return ventaService.guardarVenta(venta);
	}

	@PutMapping("/ventas/{id}")
	public Venta updateVenta(@PathVariable(name = "id") Long id, @RequestBody Venta venta) {
		
		Venta selectedVenta = new Venta(id, venta.getCajero(), venta.getProducto(), venta.getMaquina_registradora());
		Venta updatedVenta = new Venta();
		updatedVenta = ventaService.actualizarVenta(selectedVenta);
		return updatedVenta;
	}

	@DeleteMapping("/ventas/{id}")
	public void deleteVenta(@PathVariable(name = "id") Long id) {
		
		ventaService.eliminarVenta(id);
	}

}
