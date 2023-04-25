package pas.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author paul_
 *
 */

@Entity
@Table(name = "asignado_a")
public class Asignado_A {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientifico cientifico;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyecto proyecto;

	public Asignado_A() {
		
	}

	public Asignado_A(Long id, Cientifico cientifico, Proyecto proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public Long getId() {
		return id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}