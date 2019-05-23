/**
 * 
 */
package br.com.fakeapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fakeapps.dto.UsuarioFakeAppsDTO;
import br.com.fakeapps.entity.Entregador;
import br.com.fakeapps.repository.EntregadorRepository;
import br.com.fakeapps.utils.GeradorUtil;

/**
 * @author vitorlour
 *
 */

@RestController
@RequestMapping(value = "/entregador")
public class EntregadorRestController {

	private static final String INCORRETO = "incorreto";

	@Autowired
	private EntregadorRepository repository;
	
	@Autowired
	private GeradorUtil gerador;

	@PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String fazerLogin(@RequestBody UsuarioFakeAppsDTO usuario) {
		Entregador entregador = null;
		String token = null;
		if (usuario != null) {
			entregador = repository.findByEmailAndSenhaAndPlataforma(usuario.getEmail(), usuario.getSenha(), usuario.getPlataforma());
						
			if (entregador != null) {
				token = gerador.token();
				entregador.setToken(token);
				repository.save(entregador);
			}else {
				token = INCORRETO;
			}
		}
		return token;
	}

}
