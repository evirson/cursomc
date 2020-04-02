package br.com.esoft.cursomc.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.esoft.cursomc.domain.Categoria;
import br.com.esoft.cursomc.repositories.CategoriaRepository;
import br.com.esoft.cursomc.services.exceptions.ObjectNotFoundException;


/*classe responsalvel por consulta no repositorio */

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrato " + id + ", tipo " + Categoria.class.getName()));
	}

}
