/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Pieza;

/**
 * @author paul_
 *
 */

public interface IPiezaServiceInterface {

	public List<Pieza> listarPiezas();

	public Pieza guardarPieza(Pieza pieza);

	public Pieza piezaXID(Long id);

	public Pieza actualizarPieza(Pieza pieza);

	public void eliminarPieza(Long id);

}
