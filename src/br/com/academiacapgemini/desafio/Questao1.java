package br.com.academiacapgemini.desafio;

import java.util.Scanner;

public class Questao1 {
    public static void main(String args[]) { 

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de Degraus na Escada: ");
        n = entrada.nextInt();
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < (n - i) - 1)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        entrada.close();
    }
}
