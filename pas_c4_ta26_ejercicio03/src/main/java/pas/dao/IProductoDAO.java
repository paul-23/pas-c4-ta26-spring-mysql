package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Producto;

/**
 * @author paul_
 *
 */

public interface IProductoDAO extends JpaRepository<Producto, Long> {

}
