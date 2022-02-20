package br.com.academiacapgemini.desafio;

/**
 * @author Rodrigo Ferreira
 * @version 1.0.0
 * 
 * */
public class Escada {
	
	public Escada() {
	}
	
	/**
	 * Método que se encarrega de desenhar a escada
	 *
	 * @param n Recebe como paramentro um intero n definido
	 * pelo usuário.
	 * 
	 * @return Retornará um valor booleano True caso
	 * a escada tenha sido impressa.
	 */
	public boolean desenharEscada(int n) {
		boolean printed = false;
		if(n > 0) {
			for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (j < (n - i) - 1)
	                    System.out.print(" ");
	                else
	                    System.out.print("*");
	            }
	        System.out.println();
	        }
			printed = true;
		} else {
			System.out.println("Não há degraus na sua escada.");
		}
		
		return printed;
	}
}
