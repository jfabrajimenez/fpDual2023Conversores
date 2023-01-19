package es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.dao;

import java.util.List;
import java.util.Optional;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;

public interface RepositorioHabitante {
	public Habitante guardar(Habitante habitante);
	public List<Habitante>getHabitantes(String queryNif);
	public Optional<Habitante> getHabitantePorNif(String nif);
}
