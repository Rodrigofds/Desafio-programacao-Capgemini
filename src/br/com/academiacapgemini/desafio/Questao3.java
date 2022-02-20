package br.com.academiacapgemini.desafio;

import java.util.Scanner;

/**
 * @author Rodrigo Ferreira
 * @version 1.0.0
 * 
 * */
public class Questao3 {
        public static void main(String[] args) {
        
        Anagrama anagrama = new Anagrama();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a palavra: ");
        String palavra = entrada.next();

    	int retorno = anagrama.haSanagramas(palavra);
        
        System.out.println(retorno);
        entrada.close();
    }    
}