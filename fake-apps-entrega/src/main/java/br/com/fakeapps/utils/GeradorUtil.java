/**
 * 
 */
package br.com.fakeapps.utils;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author vitorlour
 *
 */
@Component
public class GeradorUtil {

	private static final Random RANDOM = new SecureRandom();

	private static final int TAMANHO_TOKEN = 15;

	private static final String LETRAS = "abcdefghjkmnpqrstuvwxyzABCDEFGHJKMNPQRSTUVWXYZ23456789+@";

	public String token() {

		StringBuilder token = new StringBuilder();
		
		for (int i = 0; i < TAMANHO_TOKEN; i++) {
			int index = (int) (RANDOM.nextDouble() * LETRAS.length());
			token.append(LETRAS.substring(index, index + 1));
		}
		return token.toString();
	}
}
