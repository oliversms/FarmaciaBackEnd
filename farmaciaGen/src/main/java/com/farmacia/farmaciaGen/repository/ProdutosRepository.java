package com.farmacia.farmaciaGen.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmacia.farmaciaGen.model.Produto;

@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Long>{ 
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("name") String name);
	
}
