package pas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.dto.Cientifico;

/**
 * @author paul_
 *
 */

public interface ICientificoDAO extends JpaRepository<Cientifico, String> {

}