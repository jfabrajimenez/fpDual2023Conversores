package es.aytos.fp.dual.conversores.usuariosdirecciones.vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Direccion;
import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.ServicioHabitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.implementaciones.ServicioHabitanteImpl;

@ViewScoped
@ManagedBean
public class FormularioDireccionVista {
	private ServicioHabitante servicioHabitante;
	
	private String calle;
	private Integer numero;
	private String bloque;
	private String puerta;
	private List<Habitante>habitantes;
	
	public FormularioDireccionVista() {
		this.servicioHabitante=new ServicioHabitanteImpl();
	}

	public List<Habitante>buscarHabitantes(String query){
		return this.servicioHabitante.getHabitantes(query);
	}
	

	public void guardar() {
		Direccion direccion = new Direccion();
		direccion.setCalle(calle);
		direccion.setNumero(numero);
		direccion.setBloque(bloque);
		direccion.setPuerta(puerta);
		direccion.setHabitantes(this.getHabitantes());
		
		FacesMessage mensaje=new FacesMessage(FacesMessage.SEVERITY_INFO, "Dirección creada", "La dirección se ha guardado correctamente");
		FacesContext.getCurrentInstance().addMessage(null, mensaje);
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
		return this.habitantes;
	}

	public void setHabitantes(List<Habitante> habitantes) {
		this.habitantes = habitantes;
	}

}
