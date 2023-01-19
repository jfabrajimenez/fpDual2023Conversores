package es.aytos.fp.dual.conversores.usuariosdirecciones.vista;

import java.time.LocalDate;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.ServicioHabitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.implementaciones.ServicioHabitanteImpl;

@ViewScoped
@ManagedBean(name="formularioHabitanteVista")
public class FormularioHabitanteVista {
	
	private ServicioHabitante servicioHabitante;
	
	
	private String nif;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private LocalDate fechaNacimiento;
	
	
	
	public FormularioHabitanteVista() {
		super();
		this.servicioHabitante=new ServicioHabitanteImpl();
	}

	public void guardar() {
		Habitante habitante=getHabitante();
		
		try {
			this.servicioHabitante.guardar(habitante);
			
			this.insertarMensajeParaUsuario(FacesMessage.SEVERITY_INFO, "Habitante guardado", "El habitante se ha guardado correctamente");
		}catch(Exception e) {
			this.insertarMensajeParaUsuario(FacesMessage.SEVERITY_ERROR, "Habitante no guardado", "No se ha podido guardar el habitante");
			
			e.printStackTrace();
		}
	}
	
	private void insertarMensajeParaUsuario(Severity tipo, String resumen, String mensaje) {
		FacesMessage msj=new FacesMessage(tipo, resumen, mensaje);
		FacesContext.getCurrentInstance().addMessage(null, msj);
	}



	private Habitante getHabitante() {
		Habitante habitante=new Habitante();
		habitante.setNif(this.nif);
		habitante.setNombre(this.nombre);
		habitante.setPrimerApellido(this.primerApellido);
		habitante.setSegundoApellido(this.segundoApellido);
		habitante.setFechaNacimiento(this.fechaNacimiento);
		
		return habitante;
	}
	
	

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
