package string2Exercicio2;

import java.util.Scanner;

public class TestePorta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Porta p1 = new Porta();

        if (p1.aberta) {
            System.out.println("a porta esta aberta");
        } else {
            System.out.println("a porta esta fechada");
        }

        p1.dimensaoX = 5.2;
        p1.dimensaoY = 6.7;
        p1.dimensaoZ = 7.0;

        System.out.println("esta é a dimensao x :" + "  " + p1.dimensaoX );
        System.out.println("esta é a dimensao y :" + "  " + p1.dimensaoY);
        System.out.println(" esta é a dimensao z :" + "  " +p1.dimensaoZ);

        p1.pintar("roxo");

        System.out.println(" esta é a cor da porta :" + "  "  + p1.cor);





    }
}
