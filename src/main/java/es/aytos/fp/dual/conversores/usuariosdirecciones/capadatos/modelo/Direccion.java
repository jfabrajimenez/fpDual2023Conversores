package es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo;

import java.util.List;

public class Direccion {
	private String calle;
	private Integer numero;
	private String bloque;
	private String puerta;
	private List<Habitante> habitantes;

	public Direccion() {
		super();
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBloque() {
		return bloque;
	}

	public void setBloque(String bloque) {
		this.bloque = bloque;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public List<Habitante> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(List<Habitante> habitantes) {
		this.habitantes = habitantes;
	}

}
