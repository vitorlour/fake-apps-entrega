/**
 * 
 */
package br.com.fakeapps.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author vitorlour
 *
 */
@Entity
@Getter
@Setter
@Table(name = "TB_ENTREGADOR")
public class Entregador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	@Column(name = "id")
	private Long id;
	
	private String nome;
	private String telefone;
	private String cpf;
	private String email;
	private String senha;
	
	@Column(name = "regiao_entrega")
	private String regiaoEntrega;
	
	@Column(name = "nr_banco")
	private String banco;
	
	@Column(name = "nr_agencia")
	private String agencia;
	
	@Column(name = "nr_conta")
	private String conta;
	
	@Column(name = "nr_plataforma")
	private Long plataforma;
	
	@Column(name = "nr_token")
	private String token;

}
