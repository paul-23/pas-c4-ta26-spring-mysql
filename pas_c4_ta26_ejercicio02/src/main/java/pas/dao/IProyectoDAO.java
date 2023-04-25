package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Proyecto;

/**
 * @author paul_
 *
 */

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
