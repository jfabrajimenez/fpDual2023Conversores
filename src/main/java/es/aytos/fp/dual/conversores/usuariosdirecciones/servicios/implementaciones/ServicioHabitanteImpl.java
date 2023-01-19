package es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.implementaciones;

import java.util.List;
import java.util.Optional;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.dao.RepositorioHabitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.dao.implementacion.RepositorioHabitanteImpl;
import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.servicios.ServicioHabitante;


public class ServicioHabitanteImpl implements ServicioHabitante {

	private RepositorioHabitante repositorioHabitante;
	
	
	
	public ServicioHabitanteImpl() {
		super();
		this.repositorioHabitante=new RepositorioHabitanteImpl();
	}



	@Override
	public Habitante guardar(Habitante habitante) {
		return repositorioHabitante.guardar(habitante);
	}



	@Override
	public List<Habitante> getHabitantes(String queryNif) {
		return this.repositorioHabitante.getHabitantes(queryNif);
	}



	@Override
	public Optional<Habitante> getHabitantePorNif(String nif) {
		return this.repositorioHabitante.getHabitantePorNif(nif);
	}

}
