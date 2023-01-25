package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome); // convenção
	
	// findByNomeContaining
	// findByNomeIsContaining
	// findByNomeContains
	
	// findByNomeStartsWith
	// findByNomeEndWith
	
	// findByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
