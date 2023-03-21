package Lista4Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Q = new int[10];
        int maior = 0;
        int posiçao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número par para a posição " + i + ": ");
            int num = input.nextInt();
            if (num % 2 == 0) {
                Q[i] = num;
            } else {
                System.out.println("Número inválido X Digite um número par.");
            }
        }

        for (int i = 0; i < 10; i++) {
            if (Q[i] > maior) {
                maior = Q[i];
                posiçao = i;
            }
        }

        System.out.println("O maior elemento de Q é " + maior + ", que está na posição " + posiçao);



        }


    }

