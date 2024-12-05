package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{ //ORM-Hibernate ajuda nesse processo
																			//Long - tipo do ID
	//Repository: interage com o banco de dados
	//Classe Postagem terá as operações CRUD
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
}
