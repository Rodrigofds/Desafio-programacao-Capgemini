package br.com.academiacapgemini.desafio;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        String login;
        String senha;
        Senha passwd = new Senha();
        int digitos;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Login: ");
        login = entrada.next();

        System.out.print("Senha: ");
        senha = entrada.next();
        entrada.close();
        
        digitos = passwd.verificador_de_senhas(senha);
        System.out.println(digitos);
    } 
}