/**
 * 
 */
package br.com.fakeapps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fakeapps.entity.Corrida;

/**
 * @author vitorlour
 *
 */
@Repository
public interface CorridaRepository extends JpaRepository<Corrida, Long> {

}
