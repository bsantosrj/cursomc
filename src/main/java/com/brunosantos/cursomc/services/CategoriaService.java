package com.brunosantos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunosantos.cursomc.domain.Categoria;
import com.brunosantos.cursomc.repositories.CategoriaRepository;
import com.brunosantos.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository rep;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}

}
