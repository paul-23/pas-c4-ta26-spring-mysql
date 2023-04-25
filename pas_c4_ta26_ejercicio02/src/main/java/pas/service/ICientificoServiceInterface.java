/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Cientifico;

/**
 * @author paul_
 *
 */
public interface ICientificoServiceInterface {

	public List<Cientifico> listarCientificos();

	public Cientifico guardarCientifico(Cientifico cientifico);

	public Cientifico cientificoXID(String id);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(String id);

}
