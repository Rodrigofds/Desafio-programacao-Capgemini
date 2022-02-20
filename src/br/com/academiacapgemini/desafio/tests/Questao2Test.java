package br.com.academiacapgemini.desafio.tests;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiacapgemini.desafio.Senha;

/**
 * @author Rodrigo Ferreira
 * @version 1.0.0
 * 
 * Questao2Test - Responsável pelos testes da Classe Questao2
 * 
 * *** Requisitos necessários para senha forte ***
 * 
 * Possuir no mínimo 6 caracteres.		
 * Contém no mínimo 1 digito.
 * Contém no mínimo 1 letra em minúsculo.
 * Contém no mínimo 1 letra em maiúsculo.
 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^*()-+
 *  
 * */
public class Questao2Test {
	
	@Test
	public void senha_atende_todos_requisitos() {
		// 1. Cenário - Testa se a senha atende a todos os requisitos listados acima.
		String passwd = "&Ya3(R"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);
		System.out.println();

		// 3. Validação - O retorno é o que falta para 6 dígitos.
		Assert.assertEquals(0, retorno);
		Assert.assertNotEquals(1, retorno);
	}
	
	@Test
	public void checar_primeiro_requisito() {
		// 1. Cenário - Testa senha menor que 6 digitos.
		String passwd = "Ya3"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);

		// 3. Validação - O retorno é o que falta para 6 dígitos.
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(2, retorno);
	}
	
	@Test
	public void checar_segundo_requisito() {
		// 1. Cenário - Testa senha >= 6 com apenas digitos númericos.
		String passwd = "12345678"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);

		// 3. Validação - O retorno é o que falta para atender a todos os requisitos.
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(1, retorno);
	}
	
	@Test
	public void checar_terceiro_requisito() {
		// 1. Cenário - Testa senha >= 6 e com apenas letras minúsculas.
		String passwd = "abcdefgh"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);

		// 3. Validação - O retorno é o que falta para atender a todos os requisitos.
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(2, retorno);
	}
	
	@Test
	public void checar_quarto_requisito() {
		// 1. Cenário - Testa senha >= 6 e com apenas letras maiúsculas.
		String passwd = "ABCDEFGH"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);

		// 3. Validação - O retorno é o que falta para atender a todos os requisitos.
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(1, retorno);
	}
	
	@Test
	public void checar_quinto_requisito() {
		// 1. Cenário - Testa senha >= 6 e com apenas caracteres especiais.
		String passwd = "!@#$%^&*()-+"; 
		Senha senha = new Senha();
		
		// 2. Funcionalidade
		long retorno = senha.verificador_de_senhas(passwd);

		// 3. Validação - O retorno é o que falta para atender a todos os requisitos.
		Assert.assertEquals(3, retorno);
		Assert.assertNotEquals(1, retorno);
	}
	
	
	

}
