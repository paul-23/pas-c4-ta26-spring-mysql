package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Venta;

/**
 * @author paul_
 *
 */

public interface IVentaDAO extends JpaRepository<Venta, Long> {

}
