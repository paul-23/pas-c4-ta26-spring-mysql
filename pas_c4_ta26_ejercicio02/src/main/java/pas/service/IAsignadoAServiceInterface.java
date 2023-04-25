/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Asignado_A;

/**
 * @author paul_
 *
 */

public interface IAsignadoAServiceInterface {

	public List<Asignado_A> listarAsignados();

	public Asignado_A guardarAsignadoA(Asignado_A asignado);

	public Asignado_A asignadoXID(Long id);

	public Asignado_A actualizarAsignado(Asignado_A asignado);

	public void eliminarAsignado(Long id);

}
