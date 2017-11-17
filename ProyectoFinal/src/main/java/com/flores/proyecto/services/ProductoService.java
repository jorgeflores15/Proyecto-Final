package com.flores.proyecto.services;

import java.util.List;

import com.flores.proyecto.exception.EmptyResultException;
import com.flores.proyecto.model.Producto;

public interface ProductoService {

List<Producto> findAll() throws EmptyResultException;
	
	Producto find(String codigo_barras) throws EmptyResultException;
	
	Producto findProductsByUserName(String usuarioId) throws EmptyResultException;
	
}
