/**
 * 
 */
package br.com.fakeapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fakeapps.entity.Entregador;

/**
 * @author vitorlour
 *
 */
@Repository
public interface EntregadorRepository extends JpaRepository<Entregador, Long> {
	
	Entregador findByEmailAndSenhaAndPlataforma(String email, String senha, Long plataforma);

}
