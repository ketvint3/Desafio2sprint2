package string2Exercicio2;

public class Porta {

    public boolean aberta = false;

    String cor;

    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;

    public double getDimensaoX() {
        return dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void fechar () {
        aberta = false;


    }
    public void abrir() {
        aberta = true;

    }
    public void pintar(String cor) {
        this.cor = cor;


    }
}
