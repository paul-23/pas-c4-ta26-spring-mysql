package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Maquina;

/**
 * @author paul_
 *
 */

public interface IMaquinaDAO extends JpaRepository<Maquina, Long> {

}
