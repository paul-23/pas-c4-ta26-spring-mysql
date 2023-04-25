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

import pas.dto.Proveedor;
import pas.service.ProveedorServiceImpl;

/**
 * @author paul_
 *
 */

@RestController
@RequestMapping("/api")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;

	@GetMapping("/proveedores")
	public List<Proveedor> listProveedores() {
		return proveedorServiceImpl.listarProveedores();
	}

	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorById(@PathVariable(name = "id") String id) {
		Proveedor proveedorxID = new Proveedor();

		proveedorxID = proveedorServiceImpl.proveedorXID(id);

		return proveedorxID;
	}

	@PostMapping("/proveedores")
	public Proveedor saveProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}

	@PutMapping("/proveedores/{id}")
	public Proveedor updateProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {
		Proveedor selectedProveedor = new Proveedor(id, proveedor.getNombre());
		Proveedor updatedProveedor = new Proveedor();

		updatedProveedor = proveedorServiceImpl.actualizarProveedor(selectedProveedor);
		return updatedProveedor;
	}

	@DeleteMapping("/proveedores/{id}")
	public void deleteProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}

}
