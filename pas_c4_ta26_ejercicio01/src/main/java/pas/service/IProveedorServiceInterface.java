/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Proveedor;

/**
 * @author paul_
 *
 */
public interface IProveedorServiceInterface {

	public List<Proveedor> listarProveedores();

	public Proveedor guardarProveedor(Proveedor proveedor);

	public Proveedor proveedorXID(String id);

	public Proveedor actualizarProveedor(Proveedor proveedor);

	public void eliminarProveedor(String id);

}
