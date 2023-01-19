package es.aytos.fp.dual.conversores.usuariosdirecciones.servicios;

import java.util.List;
import java.util.Optional;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;

public interface ServicioHabitante {
	public Habitante guardar(Habitante habitante);
	public List<Habitante> getHabitantes(String queryNif);
	public Optional<Habitante> getHabitantePorNif(String nif);
}
