package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Equipo;

/**
 * @author paul_
 *
 */

public interface IEquipoDAO extends JpaRepository<Equipo, String> {

}
