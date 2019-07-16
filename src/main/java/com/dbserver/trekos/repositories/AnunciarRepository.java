package com.dbserver.trekos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dbserver.trekos.models.ProdutosModel;

public interface AnunciarRepository extends CrudRepository <ProdutosModel, String> {
	
	

}