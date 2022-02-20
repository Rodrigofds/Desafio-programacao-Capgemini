package br.com.academiacapgemini.desafio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiacapgemini.desafio.Anagrama;

public class Questao3Test {

	@Test
	public void palavra_com_anagrama() {
		// 1. Cenário - Testa as palavras que contém ao menos 1 anagrama.
		String palavra = "ifailuhkqq";
		Anagrama anagrama = new Anagrama();
		
		// 2. Funcionalidade
		int retorno = anagrama.haSanagramas(palavra);

		// 3. Validação
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(5, retorno);
	}
	
	@Test
	public void palavra_sem_anagrama() {
		// 1. Cenário - Testa as palavras que não contém anagrama.
		String palavra = "cap";
		Anagrama anagrama = new Anagrama();
		
		// 2. Funcionalidade
		int retorno = anagrama.haSanagramas(palavra);

		// 3. Validação
		Assert.assertEquals(0, retorno);
		Assert.assertNotEquals(7, retorno);
	}
	
	@Test
	public void palavra_com_anagrama_uppercase() {
		// 1. Cenário - Testa as palavras que contém letras maiúsculas.
		String palavra = "AraRa";
		Anagrama anagrama = new Anagrama();
		
		// 2. Funcionalidade
		int retorno = anagrama.haSanagramas(palavra);

		// 3. Validação
		Assert.assertEquals(12, retorno);
		Assert.assertNotEquals(7, retorno);
	}
	
}
