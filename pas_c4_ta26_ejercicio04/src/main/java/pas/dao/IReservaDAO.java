package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Reserva;

/**
 * @author paul_
 *
 */

public interface IReservaDAO extends JpaRepository<Reserva, Long> {

}
