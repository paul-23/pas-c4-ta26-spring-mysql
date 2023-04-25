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
@Table(name = "ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "producto")
	private Producto producto;

	@ManyToOne
	@JoinColumn(name = "maquina")
	private Maquina maquina_registradora;

	public Venta() {
		
	}

	public Venta(Long id, Cajero cajero, Producto producto, Maquina maquina_registradora) {
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquina_registradora = maquina_registradora;
	}

	public Long getId() {
		return id;
	}

	public Cajero getCajero() {
		return cajero;
	}

	public Producto getProducto() {
		return producto;
	}

	public Maquina getMaquina_registradora() {
		return maquina_registradora;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setMaquina_registradora(Maquina maquina_registradora) {
		this.maquina_registradora = maquina_registradora;
	}

}
