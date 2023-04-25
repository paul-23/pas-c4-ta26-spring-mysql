package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Proveedor;

/**
 * @author paul_
 *
 */

public interface IProveedorDAO extends JpaRepository<Proveedor, String> {

}
