/**
 * 
 */
package br.com.fakeapps.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

import br.com.fakeapps.dto.StatusDTO;
import br.com.fakeapps.entity.Corrida;
import br.com.fakeapps.repository.CorridaRepository;

/**
 * @author vitorlour
 *
 */
@RestController
@RequestMapping(value = "/corrida")
public class CorridaRestController {
	
	@Autowired
	private CorridaRepository repository;
	
	final static Locale myLocale = new Locale("pt", "BR");

	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Corrida> getCorrida() {
		
		Corrida corrida1 = new Corrida();
		
		corrida1.setNomeCliente("Doutor Claudemir Cardoso");
		corrida1.setCepCliente("02675031");
		corrida1.setEndCliente("R. Ovídio Bornacina, 95");
		corrida1.setNomeEstabelecimento("Hamburgueria da Familia");
		corrida1.setCepEstabelecimento("05503010");
		corrida1.setEndEstabelecimento("R. Pres. Castelo Branco, 83");
		corrida1.setValorEntrega(10.0);
		corrida1.setPlataforma(2L);
		corrida1.setStatusCorrida(0L);
		corrida1.setTokenCorrida("dasdasdas111");
		
		repository.save(corrida1);
		
		List<Corrida> corrida = null;
		
		try {
			corrida = repository.findAll();
		} catch (Exception e) {
			e.getMessage();
		}
		
		return corrida;
	}
	
	public static void main(String[] args) {
		Faker faker = new Faker(myLocale);
		
		System.out.println(faker.address().streetName());
		System.out.print(faker.name().fullName());
	}
	
	
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void statusCorrida(@RequestBody StatusDTO dto) {
		
	}

}
