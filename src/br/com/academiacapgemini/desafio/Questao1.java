package br.com.academiacapgemini.desafio;

import java.util.Scanner;

public class Questao1 {
    public static void main(String args[]) { 
        
    	int n;
    	Escada escada = new Escada();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantidade de Degraus da Escada: ");
        n = entrada.nextInt();
        entrada.close();
        
        System.out.println(" ");
        escada.desenharEscada(n);
    }
}