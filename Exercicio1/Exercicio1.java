package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        controle();
    }
    public static void controle() {
        System.out.println("1- Aumentar volume.");
        System.out.println("2- Diminuir volume.");
        System.out.println("3- Aumentar número do canal .");
        System.out.println("4- Diminuir número do canal.");
        System.out.println("5- Consultar valor do volume e canal.");
        int volume =0,canal=0;

        while (true) {

            Scanner opcao = new Scanner(System.in);
            System.out.println("Escolha uma opção:");
            int receberOpcao = opcao.nextInt();
            switch (receberOpcao) {
                case 1:
                    volume += 1;
                    break;
                case 2:
                    volume--;
                    break;
                case 3:
                    canal++;
                    break;
                case 4:
                    canal--;
                    break;
                case 5:
                    System.out.println("Seu volume é " + volume + " e seu canal é " + canal);
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
            if (receberOpcao==0) {
                break;
            }
        }

    }
}