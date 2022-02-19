package br.com.academiacapgemini.desafio;

import java.util.Arrays;
import java.util.List;

public class Senha {
	
	List<String> specialChars = Arrays.asList("!","@","#","$","%","^","&","*","(",")","-","+");
	int maiusculas = 1;
    int minusculas = 1;
    int numeros = 1;
    int caracterEspecial = 1;
    int retorno;
	
	public Senha() {
		
	}
	
	public int verificador_de_senhas(String senha) {
		if(senha.length() < 6){
			retorno = 6 - senha.length();
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

            retorno = numeros + minusculas + maiusculas + caracterEspecial;
        }
		return retorno;
	}

}
