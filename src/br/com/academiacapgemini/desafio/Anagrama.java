package br.com.academiacapgemini.desafio;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrama {
	
	HashMap<String, Integer> dicionario = new HashMap<>();
    String chave;
    char[] parte;
    int valor;
    int total = 0;
    
    public Anagrama() {
		
	}
    
    public int checa_anagramas(String palavra) {
    	palavra = palavra.toLowerCase(); // Garante que n�o haver� letras em caixa alta e baixa, pois "A" != "a".
    	
    	for(int i = 0; i < palavra.length(); i++) {
            for(int j = i; j < palavra.length(); j++) {
                parte = palavra.substring(i, j + 1).toCharArray();
                Arrays.sort(parte);
                chave = new String(parte);

                if(dicionario.containsKey(chave)){ // Se chave j� existir no dicion�rio incrementar o valor de sua chave em 1
                    dicionario.put(chave, dicionario.get(chave) + 1);
                } else { // Caso a chave n�o exista, adiciona ela ao dicion�rio.
                    dicionario.put(chave, 1);
                }         
            }
        }
        
        for(String item : dicionario.keySet()){
            valor = dicionario.get(item);
            if(valor > 1){ // Conta a quantidade de Anagramas no dicion�rio.
                total += (valor * (valor - 1))/2;
            }
        }
        
        return total;
    }
}
