package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Pieza;

/**
 * @author paul_
 *
 */

public interface IPiezaDAO extends JpaRepository<Pieza, Long> {

}
