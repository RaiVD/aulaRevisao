package Exercicio1;
//Escreva um método Java que recebe a nota de um aluno como um double e a classifique e retorne um char de acordo com as seguintes
//        regras:
//        a. Maior ou igual a 9,00 - A
//        b. Maior ou igual a 8,0 e menor que 9,0 - B
//        c. Maior ou igual a 7,0 e menor que 8,0 - C
//        d. Maior ou igual a 6,0 e menor que 7,0 - D
//        e. Menor que 6,0 - E

import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner notaAluno = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = notaAluno.nextDouble();

        System.out.println("Você esta com: "+notaDosAlunos(nota));

    }
    public static char notaDosAlunos(double valor) {
        char a=0;

        if(valor >= 9){
            a = 'A';
        } else if (valor>=8) {
            a = 'B';

        } else if (valor>=7) {
            a = 'C';
        } else if (valor>=6) {
            a = 'D';
        } else if (valor<6) {
            a = 'E';
        }
        return a;


    }

}
