package Lista4Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] A = { 1,2,3,4,5,6,7,8,9,10};
        int[] M = new  int[10];
        System.out.println("valor armazenado");
        int X = input.nextInt();

        for (int i = 0; i < A.length; i++) {
            M[i] = A[i] * X;

        }
        System.out.println("valor gerado:" + Arrays.toString(M));


        input.close();
    }
}

