/**
 * 
 */
package pas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pas.dao.IProductoDAO;
import pas.dto.Producto;


/**
 * @author paul_
 *
 */

@Service
public class ProductoService {

	@Autowired
	IProductoDAO productoDAO;

	public List<Producto> listaProductos() {
		return productoDAO.findAll();
	}

	public Producto guardarProducto(Producto producto) {
		return productoDAO.save(producto);
	}

	public Producto productoXID(Long id) {
		return productoDAO.findById(id).get();
	}

	public Producto actualizarProducto(Producto producto) {
		return productoDAO.save(producto);
	}

	public void eliminarProducto(Long id) {
		productoDAO.deleteById(id);
	}
	
}
