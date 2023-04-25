package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Facultad;

/**
 * @author paul_
 *
 */

public interface IFacultadDAO extends JpaRepository<Facultad, Long> {

}
