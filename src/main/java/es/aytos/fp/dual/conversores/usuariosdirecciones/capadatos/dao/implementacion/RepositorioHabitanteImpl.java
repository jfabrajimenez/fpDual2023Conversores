package es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.dao.implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.dao.RepositorioHabitante;
import es.aytos.fp.dual.conversores.usuariosdirecciones.capadatos.modelo.Habitante;

public class RepositorioHabitanteImpl implements RepositorioHabitante {
	
	private static List<Habitante>baseDatos=new ArrayList<>();

	@Override
	public Habitante guardar(Habitante habitante) {
		baseDatos.add(habitante);
		return habitante;
	}

	@Override
	public List<Habitante> getHabitantes(String queryNif) {
		return baseDatos.stream().filter(habitante->habitante.getNif().startsWith(queryNif)).collect(Collectors.toList());
	}

	@Override
	public Optional<Habitante> getHabitantePorNif(String nif) {
		return baseDatos.stream().filter(habitante->habitante.getNif().equals(nif)).findAny();
	}

}
