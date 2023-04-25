package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Cajero;

/**
 * @author paul_
 *
 */

public interface ICajeroDAO extends JpaRepository<Cajero, Long> {

}
