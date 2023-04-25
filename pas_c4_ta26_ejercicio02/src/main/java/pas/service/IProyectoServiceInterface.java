/**
 * 
 */
package pas.service;

import java.util.List;

import pas.dto.Proyecto;

/**
 * @author paul_
 *
 */
public interface IProyectoServiceInterface {

	public List<Proyecto> listarProyectos();

	public Proyecto guardarProyecto(Proyecto proyecto);

	public Proyecto proyectoaXID(String id);

	public Proyecto actualizarProyecto(Proyecto proyecto);

	public void eliminarProyecto(String id);

}
