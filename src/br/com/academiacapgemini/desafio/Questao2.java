package br.com.academiacapgemini.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        List<String> specialChars = Arrays.asList("!","@","#","$","%","^","&","*","(",")","-","+");
        String nome;
        String senha;
        int maiusculas = 1;
        int minusculas = 1;
        int numeros = 1;
        int caracterEspecial = 1;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = entrada.next();

        System.out.print("Senha: ");
        senha = entrada.next();

        if(senha.length() < 6){
            System.out.println(6 - senha.length());
        } else {
            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
    
                if (Character.isDigit(c)) {
                    numeros = 0;
                } else if (Character.isLowerCase(c)) {
                    minusculas = 0;
                } else if (Character.isUpperCase(c)) {
                    maiusculas = 0;
                }
    
            }
    
            for (String caracter : specialChars) {
                if(senha.contains(caracter)){
                    caracterEspecial = 0;
                }
            }

	        int retorno = numeros + minusculas + maiusculas + caracterEspecial;
	        System.out.println(retorno);

        }
        entrada.close();      
    } 
}

