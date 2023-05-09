package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        System.out.println(retornarinformacao(entrada.next()));
        System.out.println("--------------------------------------------");

        System.out.println("Qual sua idade: ");
        System.out.println(retornarinformacao(entrada.nextInt()));
        System.out.println("--------------------------------------------");

        System.out.println("Qual seu peso e altura: ");
        System.out.println(retornarinformacao(entrada.nextDouble(), entrada.nextDouble()));


    }

    public static String retornarinformacao(String nome) {

        return "Meu nome é "+nome;
    }
    public static String retornarinformacao(int idade) {

        return "Minha idade é "+idade;
    }
    public static String retornarinformacao(double peso, double altura) {

        return "Meu peso é " + peso + " e minha altura é " + altura;
    }
}

