/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Suministra;

/**
 * @author paul_
 *
 */
public interface ISuministraServiceInterface {

	public List<Suministra> listarSuministros();

	public Suministra guardarSuministra(Suministra suministro);

	public Suministra suministraXID(Long id);

	public Suministra actualizarSuministra(Suministra suministro);

	public void eliminarSuministro(Long id);

}
