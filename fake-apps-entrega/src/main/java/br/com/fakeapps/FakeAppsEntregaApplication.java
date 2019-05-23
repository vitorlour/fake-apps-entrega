package br.com.fakeapps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.fakeapps.entity.Corrida;
import br.com.fakeapps.repository.CorridaRepository;

@SpringBootApplication
@EntityScan(basePackages = { "br.com.fakeapps.entity" })
@EnableJpaRepositories(basePackages = { "br.com.fakeapps.repository" })
@ComponentScan(basePackages = {"br.com.fakeapps"})
public class FakeAppsEntregaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FakeAppsEntregaApplication.class, args);
	}

}
