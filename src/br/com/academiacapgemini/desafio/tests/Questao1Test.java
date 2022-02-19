package br.com.academiacapgemini.desafio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiacapgemini.desafio.Escada;

/**
 * Questao1Test - Responsável pelos testes da Classe Questao1 Escada
 * 
 * */
public class Questao1Test {
	
	@Test
	public void desenhar_escada_com_zero() {
		// 1. Cenário - Testar a escada com o valor 0.
		int degraus = 0;
		Escada escada = new Escada();
		
		// 2. Funcionalidade
		escada.desenharEscada(degraus);

		// 3. Validação
		Assert.assertEquals("Não há degraus na sua escada.", 0, 0);
		Assert.assertNotEquals("Não há degraus na sua escada.", 1, 0);
	}
	
	@Test
	public void desenhar_escada_com_negativa() {
		// 1. Cenário - Testar a escada com o valor negativo.
		int degraus = -1;
		Escada escada = new Escada();
		
		// 2. Funcionalidade
		escada.desenharEscada(degraus);

		// 3. Validação
		Assert.assertEquals("Não há degraus na sua escada.", -1, -1);
		Assert.assertNotEquals("Não há degraus na sua escada.", 0, -1);
	}
	
	@Test
	public void desenhar_escada_com_degraus() {
		// 1. Cenário - Testar a escada com o valor positivo.
		int degraus = 7;
		Escada escada = new Escada();
		
		// 2. Funcionalidade
		escada.desenharEscada(degraus);

		// 3. Validação
		Assert.assertEquals("      *\r\n"
						  + "     **\r\n"
						  + "    ***\r\n"
					      + "   ****\r\n"
					      + "  *****\r\n"
						  + " ******\r\n"
						  + "*******", 7, 7);
		
		Assert.assertNotEquals("      *\r\n"
						     + "     **\r\n"
						     + "    ***\r\n"
					         + "   ****\r\n"
					         + "  *****\r\n"
						     + " ******\r\n"
						     + "*******", 4, 7);
		
	}
	
}
