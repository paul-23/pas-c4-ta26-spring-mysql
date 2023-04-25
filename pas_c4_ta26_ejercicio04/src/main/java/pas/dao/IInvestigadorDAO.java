package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Investigador;

/**
 * @author paul_
 *
 */

public interface IInvestigadorDAO extends JpaRepository<Investigador, String> {

}
